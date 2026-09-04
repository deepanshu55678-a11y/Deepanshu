package Java_Programming;
import java.util.Scanner;
public class DistanceInNthSecond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial velocity: ");
        double u = sc.nextDouble();
        System.out.print("Enter acceleration: ");
        double a = sc.nextDouble();
        System.out.print("Enter the specific second: ");
        int n = sc.nextInt();
        double sn = u + (a / 2.0) * (2 * n - 1);
        System.out.println("Distance in " + n + "th second is: " + sn);
    }
}