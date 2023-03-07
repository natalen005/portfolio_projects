package com.techelevator;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Hello!");
        System.out.println("Welcome to the Yearly Income Calculator!");

        try {
            System.out.print("Enter the your hourly wage : ");
            String userHourlyWage = keyboard.nextLine();

            System.out.print("Enter how many hours a week you work : ");
            String userHoursWorkedAWeek = keyboard.nextLine();

            System.out.print("Do you get paid every week? Or every other week?" + "\n");
            System.out.print("Enter 1 for every week and 2 for every other week : ");
            String howOftenYouGetPaid = keyboard.nextLine();

            System.out.print("How many weeks are left in the year? : ");
            String weeksLeftInYear = keyboard.nextLine();

            double wage = Double.parseDouble(userHourlyWage);
            int weeks = Integer.parseInt(weeksLeftInYear);
            int whenGettingPaid = Integer.parseInt(howOftenYouGetPaid);
            double hours = Double.parseDouble(userHoursWorkedAWeek);
            String message = "Here's roughly how much you'd make in time remaining this Year : $";
            double yearlyIncomePaidWeekly = wage * hours * weeks;

            if (whenGettingPaid == 1) {
                System.out.println();
                System.out.println("Here's roughly how much one of your paychecks is : $" + String.format("%.2f", wage * hours));
                System.out.println(message + String.format("%.2f", yearlyIncomePaidWeekly));
            } else {
                System.out.println();
                System.out.println("Here's roughly how much one of your paychecks is : $" + String.format("%.2f", (wage * hours) * 2));
                System.out.println(message + String.format("%.2f", yearlyIncomePaidWeekly));
            }

        } catch (NumberFormatException e) {
            System.out.println("Please play nice :) ");
        }
    }
}


