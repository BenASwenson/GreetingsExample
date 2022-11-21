package com.sparta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Please enter an int:");
        Scanner userInput = new Scanner(System.in);

        int timeOfDay = userInput.nextInt();

        while(timeOfDay < 1 || timeOfDay > 24) {
            System.out.println("Please enter an integer greater than 0 and less than 25:");
            userInput = new Scanner(System.in);
            timeOfDay = userInput.nextInt();
        }

        System.out.println(greeting(timeOfDay));


    }

    public static String greeting(int timeOfDay) {
        String greeting;
        if(timeOfDay >= 5 && timeOfDay <= 12) {
            greeting = "Good morning!";
        } else if(timeOfDay > 12 && timeOfDay <= 18) {
            greeting = "Good afternoon!";
        } else {
            greeting = "Good evening!";
        }
        return greeting;

    }
}