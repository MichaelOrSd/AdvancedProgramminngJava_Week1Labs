// Solves the problem without printing thruogh the loop.

import java.util.Scanner;

public class Week1Lab1_3 {
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a deposit amount: ");

        double deposit = in.nextDouble();

        System.out.println("Enter an interest rate: ");

        double interest = in.nextDouble();

        System.out.println("Enter the nymber of years: ");

        int years = in.nextInt();

        double interestRate = interest / 100;

        double futureValue = deposit * Math.pow(1 + interestRate, years);

        System.out.println("The future value is: " + futureValue);

        in.close();
        
    }
}
