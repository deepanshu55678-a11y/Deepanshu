package Java_Programming;
import java.util.Scanner;
public class PrintArrayWithIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Elements of the array with indices:");
        for (int i = 0; i < n; i++) {
            System.out.println("Index " + i + "-> " + arr[i]);
        }
    }
}
