package Java_Programming;

public class SmallestOddElement {
    public static void main(String[] args) {
        int []arr={9,8,7,6,5,4,3,2,1};
        int MinOdd=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if((arr[i]%2==1)&&arr[i]<MinOdd){
                MinOdd=arr[i];
            }
        }
        System.out.print("Smallest Odd -> "+MinOdd);
    }
}
