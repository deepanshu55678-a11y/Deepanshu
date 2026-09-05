package Java_Programming;

public class CheckElementIsPresentOrNot {
    public static void main(String [] args){
    int [] arr={1,2,3,4,5,6,7,8,9};
    int target=9;
    boolean found = false;
    for(int i=0;i<arr.length;i++){
        if(arr[i]==target){
            found=true;
            break;
        }
    }
    if(found)
        System.out.print("Element founded");
    else
        System.out.print("Element Not Founded");   
}
}
