package Java_Programming;

public class ElementLastOccurence {
    public static void main(String [] args){
        int [] arr={5,4,5,7,3,5,9,8,7,6,5,5};
        int index=-1;
        int target=5;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                index=i;
            }
        }
        System.out.print("Last Occurence-> "+ index);
    }
}
//Agr ye bola jai ki found kaun kaun si index mei target element present h vo index btao to kuch nii line no 14 ko line 10 ke baad rkh dena 
//first occurence aur last occurence mei diff itna h bs usme tumhe ye btana h vo element tumne sabse phele kaun si index mei dekha h apni array mei aur last occurence mei ye btana h tumne aakhri baar vo element kab dekha h apni array mei unki index btao do bss.
//isliye last occurence mei break nii lgega agr break lg gya vo sidha aap ko loop ke bahar le aaayega isse last occurence nii pta chalegi