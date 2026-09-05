package Java_Programming;

public class MaxElementIndex {
    public static void main(String[] args){
        int []arr={1,2,3,4,5,6,7,8,4};
        int index=-1;
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                index=i;
            }
        }
        System.out.print("Index -> "+index);
    }
    
}
