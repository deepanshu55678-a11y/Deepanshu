package Java_Programming;

public class LeftRotateOne {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9};
        int store=arr[0];
        System.out.print("Original Array-> ");
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
System.out.println();

        //ab dekho bhai hm logo ne ek element store kra lia h to loop hmko ek kaam bar tak chalana h means arr.lenght-1 tak 
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=store;
        //Now we are printing the array
        System.out.print("After rotation -> ");
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
    
    }
}

