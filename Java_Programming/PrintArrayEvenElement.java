package Java_Programming;

public class PrintArrayEvenElement {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] arr = {1, 2, 3, 4, 5};

        // Print the even elements of the array
        System.out.println("Even elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
