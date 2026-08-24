package com.joysistvi.stage1.day4;
import java.util.Scanner;

public class Activity3_Bandola {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Logical AND (&&)
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Do you have a valid ID? (true/false): ");
        boolean hasValidID = sc.nextBoolean();

        if (age >= 18 && hasValidID) {
            System.out.println("You are allowed.");
        } else {
            System.out.println("You are not allowed.");
        }

        //Logical OR (||)
        System.out.print("\nIs it weekend? (true/false): ");
        boolean isWeekend = sc.nextBoolean();

        System.out.print("Is it holiday? (true/false): ");
        boolean isHoliday = sc.nextBoolean();

        if (isWeekend || isHoliday) {
            System.out.println("No classes today.");
        } else {
            System.out.println("There are classes today.");
        }

        //Ternary operator
        System.out.print("\nEnter your score: ");
        int score = sc.nextInt();

        String result = (score >= 75) ? "Passed" : "Failed";
        System.out.println("Result: " + result);

        //Larger number
        System.out.print("\nEnter first number: ");
        int num = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int larger = (num > num2) ? num : num2;
        System.out.println("Larger number: " + larger);

        sc.close();

    }
}
