package Java_Programming;
import java.util.Scanner;
public class MaxOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
//Using ternary operator to find the maximum of two numbers
//condition ? value_if_true : value_if_false
        int max = (num1 > num2) ? num1 : num2;
        System.out.println("The maximum of " + num1 + " and " + num2 + " is " + max);
    }
}
