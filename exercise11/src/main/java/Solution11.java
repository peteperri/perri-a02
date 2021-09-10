/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */
/*
Pseudocode:
write a function to convert euros to USD
in main:
    prompt the user for the amount of euros and the exchange rate
    call the convert function while passing the amount of euros and rate
    print the result
*/

import java.util.Scanner;

public class Solution11 {

    static double convertEuros(double euros, double exRate){
        return euros * exRate;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many euros are you exchanging? ");
        double euros = input.nextDouble();
        System.out.print("What is the exchange rate? ");
        double exRate = input.nextDouble();

        double usd = convertEuros(euros, exRate);

        System.out.printf("%.2f euros at an exchange rate of %f is %.2f USD.", euros, exRate, usd);

    }
}
