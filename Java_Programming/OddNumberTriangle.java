package Java_Programming;
import java.util.Scanner;
public class OddNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for the odd number triangle: ");
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i+=2) {
            for (int j = 1; j <= i; j++) {
                if(j % 2 != 0) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
// What should you do first of all write your simple code i++ krao tab aap ko dikkat smj aayegi ki maine i+=2 kyu kra dry run is compulsory