package Java_Programming;
import java.util.Scanner;
public class StarTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of the triangle: ");
        int height = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
// Number triangle bhi bn jayega no issue bs j loop mei jo print kr rhe h * isko hta +i/j kr do number triangle ho jayega
// Alphabet triangle bhi bn jayega no issue bs j loop mei jo print kr rhe h * (char)(65 + j - 1) kr do alphabet triangle ho jayega