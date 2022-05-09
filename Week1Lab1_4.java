import java.util.Scanner;

public class Week1Lab1_4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Read in numbers until the number -999 is encountered. 
        // The sum of all number read until this point should be printed out 
        // and then the average.

        double sum = 0;
        int count = 0;
        int number = 0;

        System.out.println();
        System.out.println("The following program will run until -999 is entered.");
        System.out.println("Enter a number: ");

        while (number != -999) {
            number = in.nextInt();
            sum += number;
            count++;
            System.out.println("Enter another number: ");
        } 

        System.out.println("The sum is " + sum);
        System.out.println("The average is " + sum / count);

        // close the scanner
        in.close();
    }
}







    

