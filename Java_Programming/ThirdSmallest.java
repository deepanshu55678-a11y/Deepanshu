package Java_Programming;

public class ThirdSmallest {
    public static void main(String[] args) {
        int []arr={9,8,7,6,5,4,3,2,1};
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.print("Min -> " +min);
        System.out.println();
        int smin=Integer.MAX_VALUE;
        for(int j=0;j<arr.length;j++){
            if(arr[j]<smin && arr[j]!=min){
                smin=arr[j];
            }
        }
        System.out.print("Secound Min -> "+smin);
        System.out.println();
        int tmin=Integer.MAX_VALUE;
        for(int k=0;k<arr.length;k++){
            if(arr[k]<tmin && arr[k]!=smin && arr[k]!=min){
                tmin=arr[k];
            }
        }
        System.out.print("Third Min -> "+tmin);
    }
}
