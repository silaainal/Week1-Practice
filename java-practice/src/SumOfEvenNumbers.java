//sum of even numbers from 1 to n
//ask the user for a number N, then calculate and print the sum of all even numbers from 1 to N

import java.util.Scanner;
public class SumOfEvenNumbers {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int N = scan.nextInt();
        int total = 0;

        for (int i = 1; i <= N; i++) {
            if(i % 2 ==0){
                total += i;
            }
        }

        System.out.println("The sum of even numbers is: " + total);
    }
}