import java.util.Scanner; // import the Scanner class


// Lab 1.1: Print in words the single digit entered by the user.
public class Week1Lab1_1 { // class name

    public static void main(String[] args) { // main method
        
    Scanner in = new Scanner(System.in); // create a new Scanner object

    System.out.println("Enter a single digit: "); // prompt the user to enter a number

    int digit = in.nextInt(); 

    switch(digit) {
        case 0:
            System.out.println("Zero");
            break;
        case 1:
            System.out.println("One");
            break;
        case 2:
            System.out.println("Two");
            break;
        case 3:
            System.out.println("Three");
            break;
        case 4:
            System.out.println("Four");
            break;
        case 5:
            System.out.println("Five");
            break;
        case 6:
            System.out.println("Six");
            break;
        case 7:
            System.out.println("Seven");
            break;
        case 8:
            System.out.println("Eight");
            break;
        case 9:
            System.out.println("Nine");
            break;
        default:
            System.out.println("Invalid number");
            break;
        }

    // close the scanner
    in.close();
    
    }
}





