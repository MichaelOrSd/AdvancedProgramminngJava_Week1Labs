import java.util.Scanner;

public class Week1Lab1_5 {
    public static void main(String[] args) {

        // Create a Scanner object to read input from the user
        Scanner in = new Scanner(System.in);

        // initialize variables
        int number1, number2;
        char operator;

        // prompt the user to enter two numbers
        System.out.print("Enter a number : \n");
        number1=in.nextInt();

        System.out.print("Enter another numbber : \n");
        number2=in.nextInt();

        // prompt the user to enter an operator
        System.out.print("Enter operator (+, -, *, /): \n");
        operator = in.next().charAt(0);
        
        // perform the operation
        double addition  = number1 + number2;
        double subtraction  = number1 - number2;
        double multiplication  = number1 * number2;
        double division  = number1 / number2;

        // Switch on the operator
        switch(operator) {
        case '+':
        
            System.out.print("Total after Addition is : " + addition);
            break;
        
        case '-':
        
            System.out.print("Total after Subtraction is : " + subtraction);
            break;
        
        case '*':
        
            System.out.print("Total after Multiplication is : " + multiplication);
            break;
        
        case '/':
        
            System.out.print("Total after Division is : " + division);
            break;
        
        default:
        
            System.out.print("Invalid Operator");
            System.out.print("Please select proper operator");
            break;

        } 
    
        // close the scanner
        in.close();

    }
}