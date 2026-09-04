package Java_Programming;
import java.util.Scanner;
public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double n = sc.nextDouble();
        if (n < 0) {
            n = -n;
        }
        System.out.println("The absolute value of entered number is: " + n);
    }
}
//Absolute Value ka simple matlab hota hai kisi number ki asli numeric value ya magnitude, bina uske sign (+ ya -) ke
