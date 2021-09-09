/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */
/*
Pseudocode:
create functions to calculate and return the total slices, slices per person, and leftover slices
in main:
    create scanner object
    prompt the user for the amount of people, pizzas, and slices per pizza
    assign each value to their respective int variables
    create an int totalSlices and assign it equal to the return value of the getTotalSlices function
    print out the amount of people, amount of pizzas, and total slices
    create ints perPerson and leftovers
    assign them to the return values of getSlicesPerPerson and getLeftovers respectively
    use a formatted print statement to output the results
 */

import java.util.Scanner;
public class Solution08 {

    static int getTotalSlices(int pizzas, int slices){
        return pizzas * slices;
    }

    static int getSlicesPerPerson(int totalSlices, int people){
        return totalSlices / people;
    }

    static int getLeftovers(int totalSlices, int people){
        return totalSlices % people;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many people?");
        int people = input.nextInt();
        System.out.println("How many pizzas do you have?");
        int pizzas = input.nextInt();
        System.out.println("How many slices per pizza?");
        int slices = input.nextInt();

        int totalSlices = getTotalSlices(pizzas, slices);
        System.out.printf("%d people with %d pizzas (%d slices)", people, pizzas, totalSlices);

        int perPerson = getSlicesPerPerson(totalSlices, people);
        int leftovers = getLeftovers(totalSlices, people);
        System.out.printf("%nEach person gets %d pieces of pizza.%nThere are %d leftover pieces.", perPerson, leftovers);
    }
}
