package Java_Programming;
import java.util.Scanner;
public class StarTriangleVerticallyFlipped {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the triangle: ");
        int rows = scanner.nextInt();
        scanner.close();
        for (int i = 1; i <= rows; i++) {
           // J Loop if for to Print spaces
            for (int j = 1; j <= (rows - i); j++) {
                System.out.print("  ");
            }
            // K Loop if for to Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
//NumberTriangleVerticallyFlipped bhi same kuch nii +i/j lekin is bar k loop ke andr k+ kr dena 
//AlphabetTriangleVerticallyFlipped bhi same kuch nii +i/j lekin is bar k loop ke andr (char)(k+64) kr dena