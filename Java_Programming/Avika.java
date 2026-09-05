package Java_Programming;
import java.util.Scanner;

public class Avika {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter odd size: ");
        int n = sc.nextInt();
        int mid = n / 2;

       
        int vWidth = 2 * n - 1;

        for (int i = 0; i < n; i++) {
        
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == mid || j == 0 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");

            for (int j = 0; j < vWidth; j++) {
                if (j == i || j == (vWidth - 1 - i)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");

            
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == mid) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");

            for (int j = 0; j < n; j++) {
                if (j == 0 || (i <= mid && j == (mid - 1) + (mid - i)) || (i > mid && j == (mid - 1) + (i - mid))) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");

            for (int j = 0; j < n; j++) {
                if (i == 0 || i == mid || j == 0 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
        sc.close();
    }
}