package Java_Programming;
import java.util.Scanner;
public class ArithmeticProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first term: ");
        int a = sc.nextInt();
        System.out.print("Enter the common difference: ");
        int d = sc.nextInt();
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        System.out.println("Arithmetic Progression: ");
        for (int i = 0; i < n; i++) {
            int term = a + i * d;
            System.out.print(term + " ");
        }
    }
}
