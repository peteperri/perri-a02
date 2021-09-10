/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Peter Perri
 */
/*
    Pseudocode:
    write a function that returns the current year (findCurrentYear)
    write a function that returns the amount of years left until retirement (findYearsLeft)
    write a function that returns the retirement year (findRetirementYear)
    in main:
        create a new scanner object
        declare int variables for currentAge, retirementAge, yearsLeft, and retirementYear
        prompt the user for their current age and desired retirement age
        assign these values to their respective variables
        use the findYearsLeft and findRetirementYear functions to assign value to the
        yearsLeft and retirementYear variables
        use two formatted print statements to print the desired information
 */

import java.util.Calendar;
import java.util.Scanner;

public class Solution06 {

    static int findCurrentYear() {
        return Calendar.getInstance().get(Calendar.YEAR);
    }

    static int findYearsLeft(int retirementAge, int currentAge) {
        return retirementAge - currentAge;
    }

    static int findRetirementYear(int currentYear, int yearsLeft) {
        return (currentYear + yearsLeft);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int currentAge;
        int retirementAge;
        int yearsLeft;
        int retirementYear;

        System.out.println("What is your current age? ");
        currentAge = input.nextInt();
        System.out.println("At what age would you like to retire? ");
        retirementAge = input.nextInt();

        yearsLeft = findYearsLeft(retirementAge, currentAge);
        retirementYear = findRetirementYear(findCurrentYear(), yearsLeft);

        System.out.printf("You have %d years left until you can retire. ",yearsLeft);
        System.out.printf("%nIt's %d, so you can retire in %d.", findCurrentYear(), retirementYear);

    }
}
