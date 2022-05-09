import java.util.Scanner; // import the Scanner class

public class Week1Lab1_2 { // class name

// Lab 1.2: Print the largest of 5 numbers entered by the user.

public static void main(String[] args) { // main method

    // create a new Scanner object
    Scanner in = new Scanner(System.in); // create a new Scanner object

    // prompt the user to enter 5 numbers
    System.out.println("Enter 5 numbers: ");

    // create an array of 5 integers
    int[] numbers = new int[5];

    // read in the 5 numbers
    for (int i = 0; i < 5; i++) {
        numbers[i] = in.nextInt();
    }

    // find the largest number
    int largest = numbers[0]; // initialize the largest number
    for (int i = 0; i < 5; i++) { // loop through the array
        if (numbers[i] > largest) { // if the current number is larger than the largest number
            largest = numbers[i]; // set the largest number to the current number
        }
    }

    // print the largest number
    System.out.println("The largest number is: " + largest);

    // close the scanner
    in.close();
    }
}
