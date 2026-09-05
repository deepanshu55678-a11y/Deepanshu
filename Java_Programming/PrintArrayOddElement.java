package Java_Programming;

public class PrintArrayOddElement {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] arr = {1, 2, 3, 4, 5, 10, 11, 12, 13, 14, 15};

        // Print the odd elements of the array
        System.out.println("Odd elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
