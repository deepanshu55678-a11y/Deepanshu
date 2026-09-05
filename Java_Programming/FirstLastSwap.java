package Java_Programming;

public class FirstLastSwap {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        System.out.print("Original Array-> ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            
        }
        System.out.println();
        int temp=arr[0];
        arr[0]=arr[arr.length-1];
        arr[arr.length-1]=temp;
        System.out.print("Reverse Array->");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
