package Java_Programming;
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        int original = n;
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum += digit * digit * digit;
            n /= 10;
        }
        if (original == sum) {
            System.out.println("The given number is an Armstrong number.");
        } else {
            System.out.println("The given number is not an Armstrong number.");
        }
    }
}
