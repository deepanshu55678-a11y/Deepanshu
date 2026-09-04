package Java_Programming;
import java.util.Scanner;
public class AreaVsPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = sc.nextDouble();
        double area = length * width;
        double perimeter = 2 * (length + width);
        if (area > perimeter) {
            System.out.println("The area of the rectangle is greater than its perimeter.");
        } else if (area < perimeter) {
            System.out.println("The perimeter of the rectangle is greater than its area.");
        } else {
            System.out.println("The area and perimeter of the rectangle are equal.");
        }
    }
}
