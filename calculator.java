//Lucas Jenkins
import java.util.*;

public class calculator{
    public static float a;
    public static float b;
    public static float results;
    public static String arithmetic;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Ask for user input
        System.out.println("Please enter your first number: ");
        a = scanner.nextFloat();
        System.out.println("Please enter your second number: ");
        b = scanner.nextFloat();
        System.out.println("What arithmetic would you like to do? \n+: Addition \n-: Subtraction\n*: Multiplication\n/: Division");
        arithmetic = scanner.next();

        //Does equation for whatever arithmetic is entered
        switch (arithmetic){
            //Addition
            case "+":
                results = a + b;
                break;
            //Subtraction
            case "-":
                results = a - b;
                break;
            //Multiplication
            case "*":
                results = a * b;
                break;
            //Division
            case "/":
                //If b is 0, end program 
                if (b == 0){
                    System.out.println("Error: Divide by Zero");
                    return;
                }
                else {
                    results = a / b;
                }
                break;
            default:
                //If wrong input, end program
                System.out.println("Incorrect input");
                return;
        }
        //Shows equation and results
        System.out.printf("%f %s %f = %f", a, arithmetic, b, results);
    }
}