package com.techelevator;

import java.util.Scanner;

public class UI {

    Scanner keyboard = new Scanner(System.in);

    public double hourlyWage() {
        String userHourlyWage;
        double wage = 0;
        int tries = 0;
        while (tries < 3 & wage == 0) {
            try {
                System.out.print("Enter the your hourly wage : ");
                userHourlyWage = keyboard.nextLine();
                wage = Double.parseDouble(userHourlyWage);
            } catch (NumberFormatException e) {
                System.out.println("Please play nice :) ");
                System.out.println();
                tries++;
            }
        }
        if (tries > 2) {
            goodbye();
        }
        return wage;
    }

    public double hoursWorkedAWeek() {
        String userHoursWorkedAWeek;
        double hours = 0;
        int tries = 0;
        while (tries < 3 & hours == 0) {
            try {
                System.out.print("Enter how many hours a week you work : ");
                userHoursWorkedAWeek = keyboard.nextLine();
                hours = Double.parseDouble(userHoursWorkedAWeek);
            } catch (NumberFormatException e) {
                System.out.println("Please play nice :) ");
                System.out.println();
                tries++;
            }
        }
        if (tries > 2) {
            goodbye();
        }
        return hours;
    }

    public int howGettingPaid() {
        String howOftenYouGetPaid;
        int whenGettingPaid = 0;
        int tries = 0;
        while (tries < 3 & whenGettingPaid == 0) {
            try {
                System.out.print("Do you get paid every week? Or every other week?" + "\n");
                System.out.print("Enter 1 for every week and 2 for every other week : ");
                howOftenYouGetPaid = keyboard.nextLine();
                whenGettingPaid = Integer.parseInt(howOftenYouGetPaid);
            } catch (NumberFormatException e) {
                System.out.println("Please play nice :) ");
                System.out.println();
                tries++;
            }
        }
        if (tries > 2) {
           goodbye();
        }
        return whenGettingPaid;
    }

    public int weeksLeftInYear() {
        String weeksLeftInYear;
        int weeks = 0;
        int tries = 0;
        while (tries < 3 & weeks == 0) {
            try {
                System.out.print("How many weeks are left in the year? : ");
                weeksLeftInYear = keyboard.nextLine();
                weeks = Integer.parseInt(weeksLeftInYear);
            } catch (NumberFormatException e) {
                System.out.println("Please play nice :) ");
                System.out.println();
                tries++;
            }
        }
        if (tries > 2) {
            goodbye();
        }
        return weeks;
    }

    public void greeting() {
        System.out.println("Hello!");
        System.out.println("Welcome to the Yearly Income Calculator!");
    }

    public void goodbye(){
        System.out.println("I told you to play nice, Goodbye!");
        System.exit(1);
    }

    public void results(double wage, double hours, int whenGettingPaid, int weeks) {
        String message1 = "Here's roughly how much you'd make in time remaining this Year : $";
        String message2 = "Here's roughly how much one of your paychecks is : $";
        double yearlyIncomePaidWeekly = wage * hours * weeks;

        if (whenGettingPaid == 1) {
            System.out.println();
            System.out.println(message2 + String.format("%.2f", wage * hours));
            System.out.println(message1 + String.format("%.2f", yearlyIncomePaidWeekly));
        } else {
            System.out.println();
            System.out.println(message2 + String.format("%.2f", (wage * hours) * 2));
            System.out.println(message1 + String.format("%.2f", yearlyIncomePaidWeekly));
        }
    }

}