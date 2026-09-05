package Java_Programming;
import java.util.Scanner;
public class StarSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side length of the square: ");
        int n = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
// number square bhi bn jayega no issue bs j loop mei jo print kr rhe h * isko hta +i/j kr do number square ho jayega 