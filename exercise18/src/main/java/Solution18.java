/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Peter Perri
 */
/*
Pseudocode:
Write a function that returns a string (C or F) to prompt the user to figure out what we're converting
Write two functions to convert F to C, and C to F
in main:
    if the prompt function returns C, ask the user for the temperature in Celsius and call the function to convert Celsius. Print the result.
    else, ask the user for the temperature in Fahrenheit and call the function to convert Fahrenheit. Print the result. 
 */
import java.util.Scanner;
public class Solution18 {

    static Scanner input = new Scanner(System.in);

    String convertCorF(String prompt){
        System.out.println(prompt);
        String temp = input.nextLine();
        if (temp.equals("C") || temp.equals("c")){
            return "C";
        }
        else if(temp.equals("F") || temp.equals("f")){
            return "F";
        }
        else{
            System.out.println("You did not enter F or C. Try again.");
            return null;
        }
    }

    float convertFtoC(float f){
        return (f - 32) * 5 / 9;
    }

    float convertCtoF(float c){
        return (c * 9/5) + 32;
    }

    public static void main(String[] args){

        Solution18 s = new Solution18();
        String tempType;

        String prompt = "Press C to convert Fahrenheit to Celsius, or F to convert Celsius to Fahrenheit.";
        tempType = s.convertCorF(prompt);

        if (tempType.equals("C")){
            System.out.println("Please enter the temperature in Celsius: ");
            float temp = input.nextFloat();
            temp = s.convertCtoF(temp);
            System.out.printf("The temperature in Fahrenheit is %.2f", temp);
        }
        else{
            System.out.println("Please enter the temperature in Fahrenheit: ");
            float temp = input.nextFloat();
            temp = s.convertFtoC(temp);
            System.out.printf("The temperature in Celsius is %.2f", temp);
        }
    }
}
