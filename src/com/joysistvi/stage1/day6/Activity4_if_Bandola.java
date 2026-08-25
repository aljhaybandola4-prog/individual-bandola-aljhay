package com.joysistvi.stage1.day6;
import java.util.Scanner;

public class Activity4_if_Bandola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("GAME MENU");
        System.out.println("1. Start Game");
        System.out.println("2. Load Game");
        System.out.println("3. Settings");
        System.out.println("4. Exit");

        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("You selected Option 1: Start Game");
        } else if (choice == 2) {
            System.out.println("You selected Option 2: Load Game");
        } else if (choice == 3) {
            System.out.println("You selected Option 3: Settings");
        } else if (choice == 4) {
            System.out.println("You selected Option 4: Exit");
        } else {
            System.out.println("Invalid choice. Please try again.");
        }

        sc.close();
    }
}
