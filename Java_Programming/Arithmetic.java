package Java_Programming;
import java.util.Scanner;
public class Arithmetic {
        double a,b;    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Non-zero number: ");
        double a = sc.nextDouble();
        System.out.print("Enter the Non-zero number: ");
        double b = sc.nextDouble();
        System.out.println("Sum: " + (a + b));
        System.out.println("Diff: " + (a - b));
        System.out.println("Product: " + (a * b));
        System.out.println("Div: " + (a / b));
        System.out.println("Modulo: " + (a % b));
    }
}

    

