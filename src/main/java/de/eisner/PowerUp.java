package de.eisner;

public class PowerUp extends VirtualItem {
    private String effect;

    public PowerUp(int itemID, String name, double price, int points, String effect) {
        super(itemID, name, price, points);
        this.effect = effect;
    }

    public String getEffect() {
        return effect;
    }

    // Additional methods related to power-ups can be added here
}