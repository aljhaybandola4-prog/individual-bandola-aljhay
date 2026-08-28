package com.joysistvi.stage1.day8;
import java.util.Scanner;

public class Activity6_Bandola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Login credentials
        String correctUsername = "MyOnlySunshine";
        String correctPassword = "12345";

        String username;
        String password;

        boolean loginSuccess = false;

        // LOGIN SYSTEM - 3 ATTEMPTS
        for (int attempt = 1; attempt <= 3; attempt++) {

            System.out.println("\n=== LOGIN SYSTEM ===");
            System.out.println("Attempt " + attempt + " of 3");

            System.out.print("Enter username: ");
            username = sc.next();

            System.out.print("Enter password: ");
            password = sc.next();

            // Check username and password
            if (!username.equals(correctUsername) && !password.equals(correctPassword)) {
                System.out.println("Invalid username and password!");

            } else if (!username.equals(correctUsername)) {
                System.out.println("Invalid username!");

            } else if (!password.equals(correctPassword)) {
                System.out.println("Invalid password!");

            } else {
                System.out.println("Login successful!");
                loginSuccess = true;
                break;
            }

            // Last attempt message
            if (attempt == 3) {
                System.out.println("\nMaximum attempts reached!");
                System.out.println("Access denied!");
            } else {
                System.out.println("Please try again.");
            }
        }

        // ATM SYSTEM - Only accessible after successful login
        if (loginSuccess) {

            double balance = 5000.00;
            int choice;
            double depositAmount;
            double withdrawAmount;

            System.out.println("\n=== SIMPLE ATM MENU ===");
            System.out.println("1 - Check Balance");
            System.out.println("2 - Deposit");
            System.out.println("3 - Withdraw");
            System.out.println("4 - Exit");

            System.out.print("Enter your choice (1-4): ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Current Balance: " + balance);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    depositAmount = sc.nextDouble();

                    if (depositAmount > 0) {
                        balance = balance + depositAmount;
                        System.out.println("Deposit successful!");
                        System.out.println("New Balance: " + balance);
                    } else {
                        System.out.println("Invalid deposit amount!");
                    }
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    withdrawAmount = sc.nextDouble();

                    if (withdrawAmount > 0) {

                        if (withdrawAmount <= balance) {
                            balance = balance - withdrawAmount;
                            System.out.println("Withdrawal successful!");
                            System.out.println("New Balance: " + balance);
                        } else {
                            System.out.println("Insufficient balance!");
                        }

                    } else {
                        System.out.println("Invalid withdrawal amount!");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the Simple ATM. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}

