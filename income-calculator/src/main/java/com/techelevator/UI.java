package com.techelevator;

import java.util.Scanner;

public class UI {
    // things to do
// if makes salary how much would each paycheck be!
// cover for negative numbers
    Scanner keyboard = new Scanner(System.in);

    // hourlyWage() prompts user for how much they make hourly and returns that value, if user doesn't enter a double it will
    // catch that exception and display a message, user has 3 tries to enter a valid double, if not user gets kicked out.
    public double hourlyWage() {
        String userHourlyWage;
        double wage = 0;
        int tries = 0;
        while (tries < 3 & wage == 0) {
            try {
                System.out.print("Enter the your hourly wage? ");
                userHourlyWage = keyboard.nextLine();
                wage = Double.parseDouble(userHourlyWage);
            } catch (NumberFormatException e) {
                System.out.println("Please play nice :)" + "\n");
                tries++;
            }
        }
        if (tries > 2) {
            goodbye();
        }
        return wage;
    }

    // hoursWorkedAWeek() prompts user for how many hours they work a week and returns that value, if user doesn't enter a double it will
    // catch that exception and display a message, user has 3 tries to enter a valid double, if not user gets kicked out.
    public double hoursWorkedAWeek() {
        String userHoursWorkedAWeek;
        double hours = 0;
        int tries = 0;
        while (tries < 3 & hours == 0) {
            try {
                System.out.print("Enter how many hours a week you work? ");
                userHoursWorkedAWeek = keyboard.nextLine();
                hours = Double.parseDouble(userHoursWorkedAWeek);
            } catch (NumberFormatException e) {
                System.out.println("Please play nice :)" + "\n");
                tries++;
            }
        }
        if (tries > 2) {
            goodbye();
        }
        return hours;
    }

    // howGettingPaid() prompts user for how often they get paid and returns that value, if user doesn't enter an int it will
    // catch that exception and display a message, user has 3 tries to enter a valid int, if not user gets kicked out.
    public int howGettingPaid() {
        String howOftenYouGetPaid;
        int whenGettingPaid = 0;
        int tries = 0;
        while (tries < 3 & whenGettingPaid == 0) {
            try {
                System.out.print("Do you get paid every week? Or every other week?" + "\n");
                System.out.print("Enter 1 for every week and 2 for every other week ");
                howOftenYouGetPaid = keyboard.nextLine();
                whenGettingPaid = Integer.parseInt(howOftenYouGetPaid);
            } catch (NumberFormatException e) {
                System.out.println("Please play nice :)" + "\n");
                tries++;
            }
        }
        if (tries > 2) {
            goodbye();
        }
        return whenGettingPaid;
    }

    // weeksLeftInYear() prompts user for how many weeks are left in the year and returns that value, if user doesn't enter an int it will
    // catch that exception and display a message, user has 3 tries to enter a valid int, if not user gets kicked out.
    public int weeksLeftInYear() {
        String weeksLeftInYear;
        int weeks = 0;
        int tries = 0;
        while (tries < 3 & weeks == 0) {
            try {
                System.out.print("How many weeks are left in the year? ");
                weeksLeftInYear = keyboard.nextLine();
                weeks = Integer.parseInt(weeksLeftInYear);
            } catch (NumberFormatException e) {
                System.out.println("Please play nice :)" + "\n");
                tries++;
            }
        }
        if (tries > 2) {
            goodbye();
        }
        return weeks;
    }

    // greeting() displays a greeting message when application is started
    public void greeting() {
        System.out.println("Hello!");
        System.out.println("Welcome to the Yearly Income Calculator!");
    }

    // goodbye() displays a message and runs System.exit() to end application
    public void goodbye() {
        System.out.println("I told you to play nice, Goodbye!");
        System.exit(1);
    }

    // thanks() displays a thank-you message to user
    public void thanks() {
        System.out.println("Thank you for using the Income Calculator!");
        System.out.println("Come back again if you need :)");
    }

    // results() displays to the user via a message roughly how much they make in a single paycheck based off what information
    // the user provided earlier and roughly how much they make with time remaining in the year
    public void results(double wage, double hours, int whenGettingPaid, int weeks) {
        String message1 = "Here's roughly how much you'd make in time remaining this Year : $";
        String message2 = "Here's roughly how much one of your paychecks is : $";
        double yearlyIncomePaidWeekly = wage * hours * weeks;

        if (whenGettingPaid == 1) {
            System.out.println("\n" + message2 + String.format("%.2f", wage * hours) + "\n");
            System.out.println(message1 + String.format("%.2f", yearlyIncomePaidWeekly));
        } else {
            System.out.println("\n" + message2 + String.format("%.2f", (wage * hours) * 2) + "\n");
            System.out.println(message1 + String.format("%.2f", yearlyIncomePaidWeekly));
        }
    }

}