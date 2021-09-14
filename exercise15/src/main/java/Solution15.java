/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Peter Perri
 */
/*
Pseudocode:
Write a function to validate the user's password and return true or false
In main:
    Prompt the user for the password, assign their password to a string
    call the password validation function;
    if it returns true:
    print "welcome"
    false:
    print "i don't know you"
 */

import java.util.Scanner;

public class Solution15 {
    static boolean validatePW(String pw){
        if(pw.equals("abc$123")) {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the password?");
        String pw = input.nextLine();
        boolean isCorrect = validatePW(pw);
        if (isCorrect){
            System.out.println("Welcome!");
        }
        else{
            System.out.print("I don't know you.");
        }
    }
}
