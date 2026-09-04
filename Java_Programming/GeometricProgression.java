package Java_Programming;
import java.util.Scanner;
public class GeometricProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first term: ");
        int a = sc.nextInt();
        System.out.print("Enter the common ratio: ");
        int r = sc.nextInt();
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        System.out.println("Geometric Progression: ");
        for (int i = 0; i < n; i++) {
            int term = a * (int) Math.pow(r, i);
            System.out.print(term + " ");
        }
    }
}
