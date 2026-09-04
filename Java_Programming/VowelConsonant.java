package Java_Programming;
import java.util.Scanner;
public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an alphabet: ");
        char ch = sc.next().charAt(0);
//dekho bhai lowercase isliye kra h tum uppercase bhi kr do no issue vo aap ke upar h upper or lower krne se koi effect nii pdega rhega to vo vowel hee na bhai 
//ye upper aur lower isliye kra gya h kyu ki if ke andr bdi condition lgani pdti pdri for small letters then for Captial letter also      
if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            char lower = Character.toLowerCase(ch);
            if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                System.out.println(ch + " is a Vowel");
            } else {
                System.out.println(ch + " is a Consonant");
            }
        } else {
            System.out.println("Not an alphabet");
        }
    }
}