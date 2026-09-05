package Java_Programming;
public class ArrayAverage {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] arr = {1, 2, 3, 4, 5};
        // Calculate the sum of the elements in the array
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        // Calculate the average
        double average = (double) sum / arr.length;
        System.out.println("Average of the array elements: " + average);
    }
}
