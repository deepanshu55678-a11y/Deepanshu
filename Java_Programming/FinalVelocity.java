package Java_Programming;
import java.util.Scanner;
public class FinalVelocity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial velocity : ");
        double u = sc.nextDouble();
        System.out.print("Enter acceleration : ");
        double a = sc.nextDouble();
        System.out.print("Enter time : ");
        double t = sc.nextDouble();
        double v = u + (a * t);
        System.out.println("Final velocity is: " + v);
    }
}