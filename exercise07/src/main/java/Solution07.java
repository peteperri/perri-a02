/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */
/*
Pseudocode:
declare a constant variable for the conversion factor
write functions to get the area in feet and then convert that to meters
in main:
    create new scanner object 'input'
    prompt the user for the length/width of the room and assign their response to variables
    use the functions to get the area in feet and meters, assign each to a variable
    use a formatted print statement to tell the user the area in both feet and meters
 */
import java.util.Scanner;

public class Solution07 {

    static final double CONVERSION_FACTOR = 0.09290304;

    static double getAreaFeet(double length, double width){
        return length * width;
    }

    static double getAreaMeters(double areaFeet){
        return areaFeet * CONVERSION_FACTOR;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is the length of the room in feet?");
        double length = input.nextFloat();
        System.out.println("What is the width of the room in feet?");
        double width = input.nextFloat();

        double areaFeet = getAreaFeet(length, width);
        double areaMeters = getAreaMeters(areaFeet);

        System.out.printf("You entered dimensions of %f feet by %f feet.", length, width);
        System.out.printf("%nThe area is %n%f square feet%n%f square meters", areaFeet, areaMeters);


    }
}
