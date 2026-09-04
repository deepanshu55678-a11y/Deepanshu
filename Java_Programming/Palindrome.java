package Java_Programming;
import java.util.Scanner;
public class Palindrome {
    // ULTA SIDHA EK SAMAAN
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        int original = n;
        int reverse = 0;
        while (n != 0) {
            reverse = (reverse*10)+(n%10);
            n /= 10;
        }
        if (original == reverse) {
            System.out.println("The given number is a palindrome.");
        } else {
            System.out.println("The given number is not a palindrome.");
        }
    }
}
