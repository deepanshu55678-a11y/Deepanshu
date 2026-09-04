package Java_Programming;
import java.util.Scanner;
public class DivisibleBy5And3Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n % 5 == 0 && n % 3 == 0) {
            System.out.println(n + " is divisible by both 5 and 3.");
        } else {
            System.out.println(n + " is not divisible by both 5 and 3.");
        }
    }
}
