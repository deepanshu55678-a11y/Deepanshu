package Java_Programming;
public class CountZeroElement {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] arr = {1, 0, 3, 0, 5, 0, 7, 0, 9, 0, 11, 0, 13, 0, 15, 0, 17, 0, 19, 0};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }
        System.out.println("Count of zero elements in the array: " + count);
        System.out.println("Count of non-zero elements in the array: " + (arr.length - count));
        System.out.println("Length of the array: " + (arr.length));
    }
}
