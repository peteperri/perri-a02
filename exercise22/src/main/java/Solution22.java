/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Peter Perri
 */
/*
Pseudocode:
write a function to print the biggest number once it is found
write a function containing the algorithm to compare the numbers and call the printBiggestNum function
in main:
    prompt the user for the three numbers
    if the numbers aren't all different, print an error
    if the numbers are all different, call the numCompare function
 */
import java.util.Scanner;

public class Solution22 {

    static void printBiggestNum(int num){
        System.out.println(num + " is the biggest number.");
    }

    static void numCompare(int num1, int num2, int num3) {
        if (num1 > num2) {
            if (num1 > num3) {
                printBiggestNum(num1);
            }
            else if(num3 > num1){
                printBiggestNum(num3);
            }
        }
        else if(num2 > num1){
            if(num3 > num2) {
                printBiggestNum(num3);
            }
            else if(num2 > num3){
                printBiggestNum(num2);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = input.nextInt();
        System.out.println("Enter another number: ");
        int num2 = input.nextInt();
        System.out.println("Enter a final number: ");
        int num3 = input.nextInt();
        if (num1 == num2 || num1 == num3 || num2 == num3) {
            System.out.println("Numbers aren't all different, try again.");
        }
        else {
            numCompare(num1, num2, num3);
        }
    }
}
