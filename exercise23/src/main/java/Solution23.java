/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Peter Perri
 */
/*
Pseudocode:
Prompt the user for input
If the user's input = 'y' for yes, print one message
If the user's input = 'n' for no, print another message
If the following message is a question, repeat ad nauseum.
If the following message is a statement, end the tree.
 */
import java.util.Scanner;
public class Solution23 {
    static void troubleShoot(){
        Scanner input = new Scanner(System.in);
        System.out.println("Is the car silent when you turn the key? Enter y or n");
        if (input.nextLine().equals("y")){
            System.out.println("Are the battery terminals corroded?");
            if(input.nextLine().equals("y")){
                System.out.println("Clean terminals and try starting again.");
            }
            else{
                System.out.println("Replace cables and try again.");
            }
        }
        else{
            System.out.println("Does the car make a slicking noise?");
            if(input.nextLine().equals("y")){
                System.out.println("Replace the battery.");
            }
            else{
                System.out.println("Does the car crank up but fail to start?");
                if(input.nextLine().equals("y")){
                    System.out.println("Check spark plug connections.");
                }
                else{
                    System.out.println("Does the engine start and then die?");
                    if(input.nextLine().equals("y")){
                        System.out.println("Does your car have a fuel injection?");
                        if(input.nextLine().equals("y")){
                            System.out.println("Get it in for service.");
                        }
                        else{
                            System.out.println("Check to ensure the choke is opening and closing.");
                        }
                    }
                    else{
                        System.out.println("This should not be possible.");
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        troubleShoot();
    }
}
