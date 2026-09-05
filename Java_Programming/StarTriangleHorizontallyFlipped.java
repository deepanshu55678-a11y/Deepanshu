package Java_Programming;
import java.util.Scanner;
public class StarTriangleHorizontallyFlipped {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of the triangle: ");
        int height = scanner.nextInt();
        scanner.close();

        for (int i = 0; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print("* ");
            }
                System.out.println();
            
        }
    }
}

//NumberTriangleHorizontallyFlipped bhi bn jayega no issue bs j loop mei jo print kr rhe h * isko hta +i/j kr do number triangle ho jayega
//AlphabetTriangleHorizontallyFlipped bhi bn jayega no issue bs j loop mei jo print kr rhe h * (char)(65 + j - 1) kr do alphabet triangle ho jayega
