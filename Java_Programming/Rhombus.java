package Java_Programming;
import java.util.Scanner;
public class Rhombus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the rhombus: ");
        int rows = scanner.nextInt();
        scanner.close();

        // Upper half of the rhombus
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= (rows - i); j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= rows; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
