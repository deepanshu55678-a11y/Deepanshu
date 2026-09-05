package Java_Programming;

public class TwoPointerApproachReverseArray {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7,8,9};
        System.out.print("Original Array -> ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.print("Reversed Array -> ");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        }
    }
    

