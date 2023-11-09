package de.eisner;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingGame {
    public static void main(String[] args) {
        // Create a list to store virtual items
        ArrayList<VirtualItem> items = new ArrayList<>();
        
        // Populate the list with various items (PowerUps and Decorations)
        items.add(new PowerUp(1, "Double Points PowerUp", 10.0, 20, "Double Points"));
        items.add(new PowerUp(2, "Extra Life PowerUp", 15.0, 30, "Extra Life"));
        items.add(new Decoration(3, "Space Theme Decoration", 5.0, 10, "Space"));
        items.add(new Decoration(4, "Fantasy Theme Decoration", 7.0, 15, "Fantasy"));

        // Initialize player's points
        int playerPoints = 100;
        int totalPointsEarned = 0;
        
        Scanner scanner = new Scanner(System.in);

        while (playerPoints > 0) {
            System.out.println("Available items:");
            for (VirtualItem item : items) {
                System.out.println(item);
            }

            System.out.println("Enter the ItemID to purchase (0 to quit):");
            int choice = scanner.nextInt();

            if (choice == 0) {
                break;
            }

            boolean validChoice = false;

            for (VirtualItem item : items) {
                if (item.getItemID() == choice) {
                    validChoice = true;
                    if (item.getPrice() <= playerPoints) {
                        System.out.println("You've purchased: " + item.getName());
                        playerPoints -= item.getPrice();
                        totalPointsEarned += item.getPoints(); // Accumulate points earned
                        System.out.println("Remaining Points: " + playerPoints);
                    } else {
                        System.out.println("You don't have enough points to purchase this item.");
                    }
                    break;
                }
            }

            if (!validChoice) {
                System.out.println("Invalid ItemID. Please try again.");
            }
            
            System.out.println("Total Points Earned: " + totalPointsEarned);
           


        }
        
        
        double totalPrice = 0.0;

        for (VirtualItem item : items) {
            totalPrice += item.getPrice();
        }

        if (totalPrice > 0) {
            System.out.println("\nTotal Price: $" + totalPrice);

            // Apply a 10% discount if the total price is greater than $20
            if (totalPrice > 20) {
                double discount = totalPrice * 0.1;
                totalPrice -= discount;
                System.out.println("Discount Applied: $" + discount);
            }

            System.out.println("Final Price (after discount): $" + totalPrice);
        }

        System.out.println("Game over. Thanks for playing!");
    }
}