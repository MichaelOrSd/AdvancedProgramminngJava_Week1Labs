import java.util.Scanner;

public class Week1Lab1_6 {
    
    public static void main(String[] args) {

        try (// Create a Scanner object to read input from the user
        Scanner in = new Scanner(System.in)) {
            // initialize variables
            int[] array = new int[100];
            int[] frequency = new int[10];
            int i;

            // prompt the user to enter 100 integers from 0-9.
            System.out.print("Enter 100 integers from 0-9: \n");

            // read the integers into the array
            for (i = 0; i < 100; i++) {
                array[i] = in.nextInt();
            }

            // print the frequency of each number
            for (i = 0; i < 10; i++) {
                for (int j = 0; j < 100; j++) {
                    if (array[j] == i) {
                        frequency[i]++;
                    }
                }
                System.out.print("Frequency of " + i + " is " + frequency[i] + "\n");
            } // end of for loop  

            // close the scanner
                in.close();
                
        } // end of try block


    } // end of main method
    
    
}   // end of class
