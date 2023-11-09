package de.eisner;

public class Decoration extends VirtualItem {
    private String theme;

    public Decoration(int itemID, String name, double price, int points, String theme) {
        super(itemID, name, price, points);
        this.theme = theme;
    }

    public String getTheme() {
        return theme;
    }

    // Additional methods related to decorations can be added here
}