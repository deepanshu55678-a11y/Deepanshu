package Java_Programming;

public class DiffLargestAndSmallestElement {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9};
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        int difference = max - min;
        System.out.println("Difference -> "+difference);
    }
}
