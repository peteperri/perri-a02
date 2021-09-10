/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Peter Perri
 */
/*
Pseudocode:
write a function to calculate the cost of items based on quantity purchased
write a function to add together and return the subtotal of the items
write a function to calculate and return the tax based on the subtotal
in main:
    prompt the user for the cost and quantity of the three items
    call the quantity function on each of the three items and assign its value to three variables
    call the subtotal function on the three variables, assign to a subtotal variable
    call the tax rate function on the subtotal variable
    print relevant info (subtotal, tax, total)
 */
import java.util.Scanner;
public class Solution10 {

    static float costTimesCount(float cost, int count){
        return cost * count;
    }

    static float getSubTotal(float item1, float item2, float item3){
        return item1 + item2 + item3;
    }

    static float getTax(float subtotal){
        return (float) (subtotal * 0.055);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the cost of item 1: ");
        float item1cost = input.nextFloat();
        System.out.println("Enter the quantity of item 1: ");
        int item1count = input.nextInt();
        float item1total = costTimesCount(item1cost, item1count);


        System.out.println("Enter the cost of item 2: ");
        float item2cost = input.nextFloat();
        System.out.println("Enter the quantity of item 2: ");
        int item2count = input.nextInt();
        float item2total = costTimesCount(item2cost, item2count);

        System.out.println("Enter the cost of item 3: ");
        float item3cost = input.nextFloat();
        System.out.println("Enter the quantity of item 3: ");
        int item3count = input.nextInt();
        float item3total = costTimesCount(item3cost, item3count);

        float subtotal = getSubTotal(item1total, item2total, item3total);
        System.out.printf("Subtotal: $%.2f", subtotal);

        float tax = getTax(subtotal);
        System.out.printf("%nTax: $%.2f", tax);

        System.out.printf("%nTotal: $%.2f", subtotal + tax);

    }
}
