package DB;

import BO.Item;
import com.mysql.cj.protocol.Resultset;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Vector;

public class ItemDB extends BO.Item{
    public static Collection getItems(String item_group){
        ArrayList<Item> items = new ArrayList<>();

        try {
            Connection con = DBManager.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT id, name, description, price FROM" +
                    " T_ITEMS");

            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                String price = rs.getString("price");
                items.add(new ItemDB(id,name,description,price));

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return items;
    }
    public static Collection getItemsByID(int userID){
        ArrayList<Item> items = new ArrayList<>();

        try {
            Connection con = DBManager.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT USER_ID, Item_id, name, description, price, amount FROM T_ITEMS \n" +
                    "JOIN T_USERITEMS ON T_ITEMS.ID = T_USERITEMS.ITEM_ID\n" +
                    "WHERE T_USERITEMS.USER_ID=" + userID);

            while(rs.next()){
                int id = rs.getInt("item_id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                String price = rs.getString("price");
                int amount = rs.getInt("amount");
                for(int i = 0; i<amount;i++){
                    items.add(new ItemDB(id,name,description,price, amount));
                }


            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return items;
    }


    protected ItemDB(int id, String name, String descr, String price) {
        super(id, name, descr, price);
    }
    protected ItemDB(int id, String name, String descr, String price, int amount) {
        super(id, name, descr, price, amount);
    }
}
