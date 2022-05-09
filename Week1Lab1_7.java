// Lab not yet complete

import java.util.Scanner;

public class Week1Lab1_7 {
    
    public static void main(String[] args) {

        try (// Create a Scanner object to read input from the user
        Scanner in = new Scanner(System.in)) {
            // declare variables
            int decimal;
            int binary;
            int choice;

            // display the menu
            System.out.println("\nMenu");
            System.out.println("1. Decimal to Binary");
            System.out.println("2. Binary to Decimal");
            System.out.println("3. Exit");
            System.out.println("Enter your choice: ");
            choice = in.nextInt();

            // process the choice
            switch (choice) {
                case 1:
                    // prompt the user to enter a decimal number
                    System.out.println("Enter a decimal number: ");
                    decimal = in.nextInt();

                    // convert the decimal number to binary
                    binary = decimalToBinary(decimal);

                    // display the binary number
                    System.out.println("The binary number is: " + binary);
                    break;
                case 2:
                    // prompt the user to enter a binary number
                    System.out.println("Enter a binary number: ");
                    binary = in.nextInt();

                    // convert the binary number to decimal
                    decimal = binaryToDecimal(binary);

                    // display the decimal number
                    System.out.println("The decimal number is: " + decimal);
                    break;
                case 3:
                    // exit the program
                    System.exit(0);
                    break;
                default:
                    // display an error message
                    System.out.println("Invalid choice");
                    break;
            }
        }

    }

    public static int binaryToDecimal(int binary) {
        while (binary != 0) {
            int decimal = Integer.parseInt(decimal, 2);  

        }
        return 0;
    }

    public static int decimalToBinary(int decimal) {
        int binary = 0;
        int base = 1;
        while (decimal != 0) {
            int remainder = decimal % 2;
            decimal /= 2;
            binary += remainder * base;
            base *= 10;
        }
        return binary;
    } 
    
}

