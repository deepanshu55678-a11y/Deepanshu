package Java_Programming;
public class CountNegativeElement {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] arr = {1, -2, 3, -4, 5};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                count++;
            }
        }
        System.out.println("Count of negative elements in the array: " + count);
    }
}
