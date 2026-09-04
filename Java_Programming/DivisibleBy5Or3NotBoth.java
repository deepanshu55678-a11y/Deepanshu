package Java_Programming;
import java.util.Scanner;
public class DivisibleBy5Or3NotBoth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if ((n % 5 == 0 || n % 3 == 0) && !(n % 5 == 0 && n % 3 == 0)) {
            System.out.println(n + " is divisible by either 5 or 3, but not both.");
        } else {
            System.out.println(n + " is not divisible by either 5 or 3, or is divisible by both.");
        }
    }
}
//Is sawal ka maksad Logical Operators (||, &&, !) ki samajh check karna hai. Problem ko teen hisson me samjha jata hai:Pehli Condition (Divisible by 5 or 3):Humein aisa number chahiye jo ya toh $5$ se poori tarah divide ho jaye ya fir $3$ se.Iske liye || (Logical OR) operator use hota hai:(n % 5 == 0 || n % 3 == 0)Is condition ko $6, 9, 10, 15$ sab satisfy karenge.Doosri Condition (NOT divisible by both):Problem ki shart hai ki number dono se ek saath divide nahi hona chahiye (jaise $15, 30, 45$).Dono se divide hone ka check hota hai: (n % 5 == 0 && n % 3 == 0).Lekin humein ye nahi chahiye, isliye iske aage ! (Logical NOT) lagate hain:!(n % 5 == 0 && n % 3 == 0)Yeh expression unhi numbers ke liye true dega jo dono se divide nahi hote.Combining with AND (&&):Humein pehli condition aur doosri condition dono ek saath sahi (true) chahiye. Isliye beech me && lagate hain:if ((n % 5 == 0 || n % 3 == 0) && !(n % 5 == 0 && n % 3 == 0))
