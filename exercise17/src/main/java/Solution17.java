import java.util.Scanner;

public class Solution17 {
    static boolean findLegality(double bac){
        return (bac <= 0.08);
    }

    static double bacCalc(int gender, float oz, float weight, float hours){
        if(gender == 1){
            return ((oz * 5.14 / weight * 0.73) - (0.015 * hours));
        }
        else{
            return ((oz * 5.14 / weight * 0.66) - (0.015 * hours));
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 1 is you are male or a 2 if you are female: ");
        int gender = input.nextInt();
        System.out.println("How many ounces of alcohol did you have?");
        float oz = input.nextFloat();
        System.out.println("What is your weight, in pounds?");
        float weight = input.nextFloat();
        System.out.println("How many hours has it been since your last drink?");
        float hours = input.nextFloat();
        double bac = bacCalc(gender, oz, weight, hours);
        System.out.printf("Your BAC is %f%n", bac);
        boolean isLegal = findLegality(bac);
        if(isLegal){
            System.out.println("It is legal for you to drive.");
        }
        else{
            System.out.println("It is not legal for you to drive.");
        }
    }
}

