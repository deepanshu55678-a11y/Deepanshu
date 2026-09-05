package Java_Programming;

public class OccurencePercentage {
    public static void main(String[] args) {
        int []arr={1,2,1,2,1,3,1,3,6};
        int target=1;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                count++;
            }
        }
       double percentage = (double) count / arr.length * 100;
        System.out.print("Percentage of Occurence -> "+percentage);
    }
}
