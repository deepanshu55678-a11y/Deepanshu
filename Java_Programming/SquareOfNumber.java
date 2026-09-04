package Java_Programming;
import java.util.Scanner;
public class SquareOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = sc.nextDouble();
        double square = number * number;
        System.out.println("The square of the number is: " + square);
    }
}
