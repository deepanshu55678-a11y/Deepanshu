package Java_Programming;
public class MaxAndMinArrayToPrint {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] arr = {1, 2, 3, 4, 5};
        // Find the maximum and minimum elements of the array
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Maximum element of the array: " + max);
        System.out.println("Minimum element of the array: " + min);
    }
}
