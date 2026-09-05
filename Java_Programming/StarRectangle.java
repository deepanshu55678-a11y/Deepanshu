package Java_Programming;
import java.util.Scanner;
public class StarRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of the rectangle: ");
        int height = scanner.nextInt();
        System.out.print("Enter the width of the rectangle: ");
        int width = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
// Number rectangle bhi bn jayega no issue bs j loop mei jo print kr rhe h * isko hta +i/j kr do number rectangle ho jayega
