package Java_Programming;
public class PrintSumOfArray {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] arr = {1, 2, 3, 4, 5};

        // Calculate the sum of the elements in the array
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        // Print the sum
        System.out.println("Sum of the array elements: " + sum);
    }
}
