package Java_Programming;

public class PrintPositiveAndNegativeElement {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] arr = {1, -2, 3, -4, 5, -6, 7, -8, 9, -10};
        // Print the positive and negative elements of the array
        System.out.println("Positive elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.print(arr[i] + " ");
            }
        }

        System.out.println("\nNegative elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
