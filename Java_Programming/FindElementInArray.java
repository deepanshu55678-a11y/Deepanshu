package Java_Programming;

public class FindElementInArray {
    public static void main(String [] args) {
        //Declare and initialize an array of integers
        int[] arr = {1, 2, 3, 4, 5};
        //Element to be searched
        int target = 9;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==target)
                System.out.print("Index -> "+i);
        }
    }
}
