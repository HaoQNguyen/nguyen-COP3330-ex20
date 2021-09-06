/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Hao Nguyen
 */

package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        double taxRate;
        double tax = 0;

        System.out.print("What is the order amount? ");
        double order = input.nextDouble();
        input.nextLine(); // consuming the \n from the user's input for 'order'
        System.out.print("What state do you live in? ");
        String state = input.nextLine();

        if (state.equals("Wisconsin")) {
            taxRate = 0.05;
            System.out.print("What county do you live in? ");
            String county = input.nextLine();

            if (county.equals("Eau Claire")) {
                taxRate += 0.005;
            }
            if (county.equals("Dunn")) {
                taxRate += 0.004;
            }

            tax = order * taxRate;
            System.out.printf("The tax is $%.2f\n", tax);
        }
        if (state.equals("Illinois")) {
            taxRate = 0.08;
            tax = order * taxRate;
            System.out.printf("The tax is $%.2f\n", tax);
        }

        double total = order + tax;
        System.out.printf("The total is $%.2f.", total);
    }
}
