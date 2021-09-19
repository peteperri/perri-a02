/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Peter Perri
 */
/*
Pseudocode:
create functions to calculate tax, and check state equivalence (if the state is WI)
prompt the user for the subtotal, and the state
use the checkState function to check if the state is WI
call the calcTax function if the state is WI
print the relevant data to the console in a single formatted print statement
 */
import java.util.Scanner;
public class Solution14 {

    static double calcTax(double orderAmt){

        return orderAmt * 0.055;
    }
    static boolean checkState(String state){

        return state.equals("WI");
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double tax = 0;

        System.out.println("What is the order amount?");
        double orderAmt = input.nextDouble();
        input.nextLine();
        System.out.println("What is the state?");
        String state = input.nextLine();


        boolean isWI = checkState(state);

        if (isWI) {
            tax = calcTax(orderAmt);
        }

        System.out.printf("The subtotal is $%.2f. The tax is $%.2f. The total is $%.2f.", orderAmt, tax, (orderAmt + tax));

    }
}
