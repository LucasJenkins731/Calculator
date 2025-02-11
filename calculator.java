import java.util.*;

public class calculator{
    public static int a;
    public static int b;
    public static int results;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //Ask for user input
        System.out.printf("Please enter your first number: ");
        a = scanner.nextInt();
        System.out.printf("Please enter your second number: ");
        b = scanner.nextInt();
        results = a + b;
        //Shows addition
        System.out.printf("%d + %d = %d", a, b, results);
    }
}