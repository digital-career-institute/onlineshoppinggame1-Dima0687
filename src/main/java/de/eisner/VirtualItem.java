package de.eisner;

public class VirtualItem {
    private int itemID;
    private String name;
    private double price;
    private int points;

    public VirtualItem(int itemID, String name, double price, int points) {
        this.itemID = itemID;
        this.name = name;
        this.price = price;
        this.points = points;
    }

    // Getters and setters for attributes
    public int getItemID() {
        return itemID;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getPoints() {
        return points;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "ItemID: " + itemID + ", Name: " + name + ", Price: $" + price + ", Points: " + points;
    }
}