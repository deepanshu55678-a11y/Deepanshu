package Java_Programming;
import java.util.Scanner;
public class Pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the pyramid: ");
        int rows = scanner.nextInt();
        scanner.close();
        for (int i = 1; i <= rows; i++) {
           // J Loop if for to Print spaces
            for (int j = 1; j <= (rows - i); j++) {
                System.out.print(" ");
            }
            // K Loop if for to Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
//Star Triangle Vertically Flipped and Pyramid are similar in structure, bss ek change krna h aap ko aur ye yaad bhi rkhna for future StarTriangleVerticallyFlipped mei jo j loop h hmara usme agr 2 spaces rkhoge to Star Triangle Vertically Flipped ka output aayega aur agr 1 space rkhoge to Pyramid ka output aayega.