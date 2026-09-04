package Java_Programming;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        boolean found = true;
        if (n <= 1) {
            found = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    found = false;
                    break;
                }
            }
        }
        if (found) {
            System.out.println("The given number is a prime number.");
        } else {
            System.out.println("The given number is not a prime number.");
        }
    }
}
