package com.joysistvi.stage1.day9;
import java.util.Scanner;

public class Activity7_part2_Bandola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of multiplication tables: ");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            System.out.println("\nMultiplication Table of " + i);

            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }
        sc.close();
    }
}
