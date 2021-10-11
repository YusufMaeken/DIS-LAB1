package DB;

import com.mysql.jdbc.Driver;

import java.sql.*;
import java.sql.DriverManager;

public class DBManager {
    private static DBManager instance = null;
    private Connection con = null;
    String URL, name, pass;

    private static DBManager getInstance(){
        if(instance==null){
            instance = new DBManager();
        }
        return instance;
    }
    private DBManager(){
        try {
            URL = "jdbc:mysql://localhost:3306/WebShop?serverTimezone=UTC";
            name = "root";
            pass= "123456Aa";
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(URL,name,pass);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection(){
        return getInstance().con;
    }
}
