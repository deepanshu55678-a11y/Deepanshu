package Java_Programming;
import java.util.Scanner;
public class PointInCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x-coordinate of the point: ");
        double x = sc.nextDouble();
        System.out.print("Enter y-coordinate of the point: ");
        double y = sc.nextDouble();
        System.out.print("Enter x-coordinate of the circle's center: ");
        double centerX = sc.nextDouble();
        System.out.print("Enter y-coordinate of the circle's center: ");
        double centerY = sc.nextDouble();
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        double distanceSquared = Math.pow(x - centerX, 2) + Math.pow(y - centerY, 2);
        double radiusSquared = Math.pow(radius, 2);
        if (distanceSquared < radiusSquared) {
            System.out.println("The point is inside the circle.");
        } else if (distanceSquared == radiusSquared) {
            System.out.println("The point is on the circle.");
        } else {
            System.out.println("The point is outside the circle.");
        }
    }
}
