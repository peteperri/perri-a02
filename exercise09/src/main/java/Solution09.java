/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Peter Perri
 */
/*
Pseudocode:
write a function to calculate and print how many gallons of paint are needed (PaintCalc)
write a function to calculate area
create new scanner object
create constant variable for a gallon of paint (350 sq feet)
prompt the user for the length and width of their room
assign the l and w to variables
call area function, assign to area variable
call PaintCalc
 */
import java.util.Scanner;
public class Solution09 {

    static final int CONVERSION_RATE = 350;

    static void paintCalc(double area){
        double temp = (area/CONVERSION_RATE);
        double buckets = Math.ceil(temp);
        System.out.printf("You will need to purchase %.0f gallons of paint to cover %.0f square feet.", buckets, area);
    }
    static double areaCalc(double length, double width){
        return length * width;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How long is the room?");
        double length = input.nextFloat();
        System.out.println("How wide is the room?");
        double width = input.nextFloat();

        double area = areaCalc(length, width);
        paintCalc(area);

    }
}
