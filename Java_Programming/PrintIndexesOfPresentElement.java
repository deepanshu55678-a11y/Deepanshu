package Java_Programming;

public class PrintIndexesOfPresentElement {
    public static void main(String[] args) {
        int []arr={1,2,1,4,1,5,1};
        int target=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("Index -> "+i);
            }
        }
    }
}
