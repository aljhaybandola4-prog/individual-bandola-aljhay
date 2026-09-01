package com.joysistvi.stage1.day11;
import java.util.Scanner;

public class Activity9_Bandola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("       Average Calculator");
        System.out.println("==============================");

        System.out.print("Enter number of students: ");
        int numStudents = sc.nextInt();

        System.out.print("Enter number of subjects: ");
        int numSubjects = sc.nextInt();
        sc.nextLine();

        String[] subjects = new String[numSubjects];

        System.out.println("\nEnter subject names:");

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            subjects[i] = sc.nextLine();
        }

        String[] studentNames = new String[numStudents];
        double[][] grades = new double[numStudents][numSubjects];
        double[] averages = new double[numStudents];

        for (int i = 0; i < numStudents; i++) {

            System.out.print("\nName of Student " + (i + 1) + ": ");
            studentNames[i] = sc.nextLine();

            double sum = 0;

            System.out.println("Enter grades for each subject:");

            for (int j = 0; j < numSubjects; j++) {
                System.out.print(subjects[j] + ": ");
                grades[i][j] = sc.nextDouble();

                sum += grades[i][j];
            }

            averages[i] = sum / numSubjects;

            sc.nextLine();
        }

        System.out.println("\n==============================");
        System.out.println("          Grades Report");
        System.out.println("==============================");

        System.out.printf("%-15s", "Student");

        for (int i = 0; i < numSubjects; i++) {
            System.out.printf("%-12s", subjects[i]);
        }

        System.out.printf("%-10s%n", "Average");

        System.out.println("----------------------------------------------");

        for (int i = 0; i < numStudents; i++) {

            System.out.printf("%-15s", studentNames[i]);

            for (int j = 0; j < numSubjects; j++) {
                System.out.printf("%-12.0f", grades[i][j]);
            }

            System.out.printf("%-10.2f%n", averages[i]);
        }

        sc.close();
    }
}
