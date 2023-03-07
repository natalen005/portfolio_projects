package com.techelevator;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        UI ui = new UI();

        ui.greeting();

        double wage = ui.hourlyWage();
        double hours = ui.hoursWorkedAWeek();
        int whenGettingPaid = ui.howGettingPaid();
        int weeks = ui.weeksLeftInYear();

        ui.results(wage, hours, whenGettingPaid, weeks);

    }
}

