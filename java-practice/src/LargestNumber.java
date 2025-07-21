//find the largest of three numbers
//ask the user to enter 3 numbers, then print the largest one.

import java.util.Scanner;

public class LargestNumber {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number:");
        double num1 = scan.nextDouble();
        System.out.print("Enter second number:");
        double num2 = scan.nextDouble();
        System.out.print("Enter third number:");
        double num3 = scan.nextDouble();

        double largest = num1;

        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }

        System.out.println("The largest number is " + largest);
    }
}

