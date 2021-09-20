/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Peter Perri
 */
/*
Pseudocode:
Write a function to prompt the user and return an integer entered by the user (1-12)
Write a function that prints the correct month depending on the int it receives
in main:
    call both functions
 */
import java.util.Scanner;
public class Solution21 {

    static Scanner input = new Scanner(System.in);

    int promptUser(){
        System.out.println("Please enter the number of the month: ");
        return input.nextInt();
    }
    void printMonth(int num){
        String str1 = "The name of the month is ";
        String str2;
        switch (num) {
            case 1 -> str2 = "January";
            case 2 -> str2 = "February";
            case 3 -> str2 = "March";
            case 4 -> str2 = "April";
            case 5 -> str2 = "May";
            case 6 -> str2 = "June";
            case 7 -> str2 = "July";
            case 8 -> str2 = "August";
            case 9 -> str2 = "September";
            case 10 -> str2 = "October";
            case 11 -> str2 = "November";
            case 12 -> str2 = "December";
            default -> str2 = "Error";
        }
        System.out.println(str1 + str2);
    }
    public static void main(String[] args) {
        Solution21 s = new Solution21();
        s.printMonth(s.promptUser());

    }
}
