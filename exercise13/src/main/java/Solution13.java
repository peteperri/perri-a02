/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Peter Perri
 */
/*
Pseudocode:
write a function to calculate simple interest A = P(1 + r/n)^(n*t)
in main:
    prompt the user for the principal, rate of interest, number of years, and number of times interest is compounded
    call calculation function
    print result
*/

import java.util.Scanner;
public class Solution13 {
    static double getInterest(double p, double r, double t, int n){
        return p * Math.pow((1 + r/n), (n*t));
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the principal: ");
        double principal = input.nextDouble();

        System.out.println("Enter the rate of interest: ");
        double rate = (input.nextDouble()/100);

        System.out.println("Enter the number of years: ");
        double time = input.nextDouble();

        System.out.println("Enter the number of times the interest is compounded per year?");
        int compounded = input.nextInt();

        double amount = getInterest(principal, rate, time, compounded);
        System.out.printf("After %.2f years at %.2f%%, compounded %d times per year, the investment will be worth $%.2f.", time, rate * 100, compounded, amount);


    }
}
