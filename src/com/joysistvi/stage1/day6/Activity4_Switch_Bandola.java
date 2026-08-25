package com.joysistvi.stage1.day6;
import java.util.Scanner;

public class Activity4_Switch_Bandola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("STUDENT PORTAL MENU");
        System.out.println("1. View Grades");
        System.out.println("2. Enroll Subjects");
        System.out.println("3. Pay Tuition");
        System.out.println("4. Exit");

        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You selected Option 1: View Grades");
                break;

            case 2:
                System.out.println("You selected Option 2: Enroll Subjects");
                break;

            case 3:
                System.out.println("You selected Option 3: Pay Tuition");
                break;

            case 4:
                System.out.println("You selected Option 4: Exit");
                break;

            default:
                System.out.println("Invalid choice. Please try again.");
        }

        sc.close();
    }
}
