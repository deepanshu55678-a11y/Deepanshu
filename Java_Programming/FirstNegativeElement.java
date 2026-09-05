package Java_Programming;

public class FirstNegativeElement {
    public static void main(String[] args) {
        int []arr={1,2,3,4,-5,6,7,8,-9};
        int Negative=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                Negative = arr[i];
                break;
            }
        }
        System.out.print("First Negative -> "+Negative);
    }
}
