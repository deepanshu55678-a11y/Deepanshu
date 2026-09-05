package Java_Programming;

public class MinElementIndex {
    public static void main(String []args){
        int []arr={9,8,7,6,5,4,3,2,1};
        int min=arr[0];
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
                index=i;
            }
        }
        System.out.print("Index -> "+index);
    }
    
}
