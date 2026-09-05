package Java_Programming;

public class SecoundLargest {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9};
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int smax=Integer.MIN_VALUE;
        System.out.print("Max -> "+max);
        for(int j=0;j<arr.length;j++){
            if(arr[j]>smax&&arr[j]!=max){
                smax=arr[j];
            }
        }
        System.out.println();
        System.out.print("Secound Max -> "+smax);
    }
}
