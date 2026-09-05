package Java_Programming;

public class ThirdLargest {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.print("Max -> "+max);
        System.out.println();
        int smax=Integer.MIN_VALUE;
        for(int j=0;j<arr.length;j++){
            if(arr[j]>smax && arr[j]!=max){
                smax=arr[j];
            }
        }
        System.out.print("Secound Max -> "+smax);
        System.out.println();
        int tmax=Integer.MIN_VALUE;
        for(int k=0;k<arr.length;k++){
            if(arr[k]>tmax && arr[k]!=smax && arr[k]!=max){
                tmax=arr[k];
            }
        }
        System.out.print("Third Max -> "+tmax);
    }
}
