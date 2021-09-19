/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Peter Perri
 */
/*
Pseudocode:
write a function to calculate tax depending on the user's entered state and county
in main:
    prompt the user for their state, county, and order total
    call the calcTax function, which returns the tax
    in a single formatted print statement, print out the tax and the subtotal + tax (total)
 */
import java.util.Scanner;
public class Solution20 {

    static Scanner input = new Scanner(System.in);

    double calcTax(double subtotal, String state, String county){
        if (state.equals("WI")) {
            if(county.equals("Eau Claire")) {
                return subtotal * 0.055;
            }
            else if(county.equals("Dunn")) {
                return subtotal * 0.054;
            }
            else {
                return subtotal * 0.05;
            }
        }
        else if (state.equals("IL")) {
            return subtotal * 0.08;
        }
        else {
            return 0;
        }
    }


    public static void main(String[] args) {
        Solution20 s = new Solution20();

        System.out.println("What is the order amount?");
        double subtotal = input.nextFloat();
        System.out.println("What state do you live in?");
        input.nextLine();
        String state = input.nextLine();
        System.out.println("What county do you live in?");
        String county = input.nextLine();

        double tax = s.calcTax(subtotal, state, county);
        System.out.printf("The tax is $%.2f.%nThe total is $%.2f", tax, subtotal + tax);
    }
}

