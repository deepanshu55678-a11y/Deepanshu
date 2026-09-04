package Java_Programming;
import java.util.Scanner;
public class Displacement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial velocity : ");
        double u = sc.nextDouble();
        System.out.print("Enter acceleration : ");
        double a = sc.nextDouble();
        System.out.print("Enter time (t): ");
        double t = sc.nextDouble();
        double s = (u * t) + (0.5 * a * t * t);
        System.out.println("Total displacement  is: " + s);
    }
}