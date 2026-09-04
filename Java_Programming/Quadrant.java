package Java_Programming;
import java.util.Scanner;
public class Quadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x-coordinate: ");
        double x = sc.nextDouble();
        System.out.print("Enter y-coordinate: ");
        double y = sc.nextDouble();

        if (x > 0 && y > 0) {
            System.out.println("Point lies in Quadrant I");
        } else if (x < 0 && y > 0) {
            System.out.println("Point lies in Quadrant II");
        } else if (x < 0 && y < 0) {
            System.out.println("Point lies in Quadrant III");
        } else if (x > 0 && y < 0) {
            System.out.println("Point lies in Quadrant IV");
        } else {
            System.out.println("Point lies on an axis");
        }
    }
}
