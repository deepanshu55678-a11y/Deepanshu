package Java_Programming;

public class FirstPositiveElement {
    public static void main(String[] args) {
        int []arr={-1,-2,-3,-4,-5,-6,-7,-8,9};
        int positive=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                positive = arr[i];
                break;
            }
        }
        System.out.println("First Positive -> "+positive);
    }
}
