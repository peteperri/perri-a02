/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Peter Perri
 */
/*
Pseudocode:
prompt the user for height and weight
call a function that calculates BMI
print the bmi + if the user is too fat or too skinny
 */
import java.util.Scanner;

public class Solution19 {

    static Scanner input = new Scanner(System.in);

    float calcBMI(float weight, float height){
       return (weight / (height * height)) * 703;
    }
    boolean isHealthy(float bmi){
        return bmi > 18.5 && bmi < 25;
    }
    public static void main(String[] args) {
        Solution19 s = new Solution19();

        System.out.println("What is your weight?");
        float weight = input.nextFloat();
        System.out.println("What is your height (in inches)?");
        float height = input.nextFloat();

        float bmi = s.calcBMI(weight, height);

        if(s.isHealthy(bmi)){
            System.out.printf("Your BMI is %.1f. %nYou are within the ideal range.", bmi);
        }
        else{
            if (bmi < 18.5){
                System.out.printf("Your BMI is %.1f. %nYou are underweight.", bmi);
            }
            else{
                System.out.printf("Your BMI is %.1f. %nYou are overweight.", bmi);
            }
        }
    }
}
