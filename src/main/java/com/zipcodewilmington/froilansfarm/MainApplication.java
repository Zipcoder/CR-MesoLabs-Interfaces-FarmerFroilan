package com.zipcodewilmington.froilansfarm;

import java.util.Scanner;

/**
 * Created by leon on 2/26/18.
 */
public class


MainApplication {
    public static void main(String[] args) {
        farmersLife week = new farmersLife();
        week.sunday();
        pause();
        week.monday();
        pause();
        week.tuesday();
        pause();
        week.wednesday();
        pause();
        week.thursday();
        pause();
        week.friday();
        pause();
        week.saturday();

    }
    public static void pause() {
        Scanner scanner = new Scanner(System.in);
        String pause = scanner.nextLine();
    }
}

