package Java_Programming;
public class MinOfArray {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] arr = {5, 2, 8, 1, 4};
        // Find the minimum element in the array
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum element in the array: " + min);
    }
}
