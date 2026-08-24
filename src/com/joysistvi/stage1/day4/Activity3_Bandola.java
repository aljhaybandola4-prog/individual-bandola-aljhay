package com.joysistvi.stage1.day4;

public class Activity3_Bandola {

    public static void main(String[] args) {
        double income = 30000;
        double foodallow = 1000;
        double transportation = 2000;
        double rent = 6000;
        double utilityBill = 3500;

        System.out.println("Income: " + income);

        // percentage of food
        double percentageFood = foodallow / income * 100;
        System.out.printf("Food Allowance: %.1f %%", percentageFood);

        // percentage of transportation
        double percentageTranspo = transportation / income * 100;
        System.out.printf("\nTransportation: %.1f %%", percentageTranspo);

        // percentage of rent
        double percentageRent = rent / income * 100;
        System.out.printf("\nRent: %.1f %%", percentageRent);

        // percentage of utility bill
        double percentageUtility = utilityBill / income * 100;
        System.out.printf("\nUtility Bill: %.1f %%", percentageUtility);

        // remaining balance
        double totalExpenses = foodallow + transportation + rent + utilityBill;
        double balance = income - totalExpenses;
        System.out.println("\nRemaining Balance: " + balance);
    }
}
