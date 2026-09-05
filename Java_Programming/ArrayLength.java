package Java_Programming;
import java.util.Scanner;
public class ArrayLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Length of the array: " + arr.length);
    }
    
}
// for to find the length of the array we can use arr.length property which will give us the length of the array.
