/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Peter Perri
 */
/*
Pseudocode:
write a function to receive an int and return a boolean to check if the user can drive
in main:
    prompt the user for their age and assign their age to an integer variable
    check if they are old enough to drive using the checkAge function
    if they are old enough to drive, print they are old enough to drive.
    else print "not old enough to drive"
 */
import java.util.Scanner;

public class Solution16 {
    static boolean checkAge(int age){
        return age >= 16;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = input.nextInt();
        String output = (checkAge(age)) ? "You are old enough to legally drive." : ("You are not old enough to legally drive.");
        System.out.println(output);

    }
}
