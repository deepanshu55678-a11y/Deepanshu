package Java_Programming;
import java.util.Scanner;
public class VelocityThirdEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial velocity: ");
        double u = sc.nextDouble();
        System.out.print("Enter acceleration: ");
        double a = sc.nextDouble();
        System.out.print("Enter displacement: ");
        double s = sc.nextDouble();
        double v = Math.sqrt((u * u) + (2 * a * s));
        System.out.println("Final velocity is: " + v);
    }
}