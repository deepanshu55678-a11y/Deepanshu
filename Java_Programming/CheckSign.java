package Java_Programming;
import java.util.Scanner;
public class CheckSign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double n = sc.nextDouble();
        if (n > 0) {
            System.out.println(n + " is positive.");
        } else if (n < 0) {
            System.out.println(n + " is negative.");
        } else {
            System.out.println(n + " is zero.");
        }
    }
}
