package Java_Programming;
import java.util.Scanner;
public class Bridge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the bridge: ");
        int rows = scanner.nextInt();
       // Top row
        for (int j = 1; j <= 2 * rows + 1; j++) {
            System.out.print("* ");
        }
        System.out.println();
        // Remaining rows
        for (int i = 1; i <= rows; i++) {
            // Left stars
            for (int j = 1; j <= rows - i + 1; j++) {
                System.out.print("* ");
            }
            // Middle spaces
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("  ");
            }
            // Right stars
            for (int j = 1; j <= rows - i + 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        scanner.close();
    }
}