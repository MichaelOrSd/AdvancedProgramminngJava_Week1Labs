import java.util.Scanner;

public class Week1Lab1_6a {
    public static void main(String[] args) {

        try (// Create a Scanner object to read input from the user
        Scanner in = new Scanner(System.in)) {
        }

        // Write a java class that rendomly inputs integers (from 0 to 9) into an array, until 100 integers are entered.

        // initialize variables
        int[] array = new int[100];
        int[] frequency = new int[10];
        int i;

        // randomly input integers into the array
        for (i = 0; i < 100; i++) {
            array[i] = (int) (Math.random() * 10);
        }

        // print the frequency of each number
        for (i = 0; i < 10; i++) {
            for (int j = 0; j < 100; j++) {
                if (array[j] == i) {
                    frequency[i]++;
                }
            }
            System.out.print("Frequency of " + i + " is " + frequency[i] + "\n");
        }
    }
}
