package Java_Programming;

public class ReverseArray {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] arr = {1, 2, 3, 4, 5};

        // Print the original array
        System.out.println("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
            System.out.println();
            System.out.println("Reversed array: ");
            for(int j = arr.length - 1; j >= 0; j--) {
                System.out.print(arr[j] + " ");
            }
        }
    }

