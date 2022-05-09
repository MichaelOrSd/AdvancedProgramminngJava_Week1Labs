// Solves the problem with printing through the loop.

import java.util.Scanner;

public class Week1Lab1_3a {
   
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a deposit amount: ");

        double deposit = in.nextDouble();

        System.out.println("Enter an interest rate: ");

        double interest = in.nextDouble();

        System.out.println("Enter the number of years: ");

        // input the amout of years to loop through the interest rate
        int years = in.nextInt();

        // input the interest rate
        double interestRate = interest / 100;

        // loop through the years
        for (int i = 1; i < years + 1; i++) {

            // calculate the interest rate
            double interestRateCalc = deposit * Math.pow(1 + interestRate, i);

            // print the interest rate
            System.out.println("The interest rate is: " + interestRateCalc);

        }

        // close the scanner
        in.close();

    }
}



