package UI;

public class ItemInfo {
    private String name;
    private String descr;
    private String price;
    private int amount;

    public ItemInfo(String name, String descr, String price) {
        this.name = name;
        this.descr = descr;
        this.price = price;
    }

    public ItemInfo(String name, String descr, String price, int amount) {
        this.name = name;
        this.descr = descr;
        this.price = price;
        this.amount = amount;
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
}
