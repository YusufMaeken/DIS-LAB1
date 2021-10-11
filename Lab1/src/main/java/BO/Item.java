package BO;

import DB.ItemDB;

import java.util.Collection;

public class Item {
    private int id;
    private String name;
    private String descr;
    private String price;
    private int amount;


    static public Collection getItems(String group){
        return ItemDB.getItems(group);
    }

    static public Collection getItemsByID(int userID){
        return ItemDB.getItemsByID(userID);
    }


    protected Item(int id, String name, String descr, String price) {
        this.id = id;
        this.name = name;
        this.descr = descr;
        this.price = price;
    }

    protected Item(int id, String name, String descr, String price, int amount) {
        this.id = id;
        this.name = name;
        this.descr = descr;
        this.price = price;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getAmount() { return amount; }

    public void setAmount(int amount) { this.amount = amount; }
}
