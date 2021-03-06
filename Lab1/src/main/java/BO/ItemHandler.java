package BO;

import UI.ItemInfo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ItemHandler {
    public static Collection<ItemInfo> getItemsWithGroup(String s){
        Collection c = Item.getItems(s);
        ArrayList<ItemInfo> items = new ArrayList<ItemInfo>();
        for(Iterator it = c.iterator(); it.hasNext();){
            Item item = (Item) it.next();
            items.add(new ItemInfo(item.getName(),item.getDescr(), item.getPrice()));
        }
        return items;
    }
    public static Collection<ItemInfo> getItemsByUserID(int userID){
        Collection c = Item.getItemsByID(userID);
        ArrayList<ItemInfo> items = new ArrayList<ItemInfo>();
        for(Iterator it = c.iterator(); it.hasNext();){
            Item item = (Item) it.next();
            items.add(new ItemInfo(item.getName(),item.getDescr(), item.getPrice(), item.getAmount()));
        }
        return items;
    }

}
