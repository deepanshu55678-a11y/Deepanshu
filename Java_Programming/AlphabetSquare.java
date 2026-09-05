package Java_Programming;
import java.util.Scanner;
public class AlphabetSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side length of the square: ");
        int n = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((char)(65 + j - 1) + " ");
            }
            System.out.println();
        }
    }
}
