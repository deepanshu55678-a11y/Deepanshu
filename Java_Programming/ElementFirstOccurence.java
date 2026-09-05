package Java_Programming;

public class ElementFirstOccurence {
    public static void main(String [] args){
        int [] arr={1,2,3,4,5,6,7};
        int target=7;
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                index=i;
                break;
            }
        }
        System.out.print("Index -> " + index);
    }
}
