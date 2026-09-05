package Java_Programming;

public class HowManyTimesElementIsPresent {
    public static void main(String [] args){
        int []arr={1,1,1,1,1,1,1,5,56,4,3,2,9};
        int count=0;
        int target=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                count++;
            }
        }
        System.out.print("Occurence -> "+count);
    }
}
