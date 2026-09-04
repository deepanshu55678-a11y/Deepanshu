package Java_Programming;
import java.util.Scanner;
public class CubeOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = sc.nextDouble();
        double cube = number * number * number;
        System.out.println("The cube of the number is: " + cube);
    }
}
