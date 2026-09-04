package Java_Programming;
import java.util.Scanner;
public class ValidTraingelCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first side of the triangle: ");
        int side1 = sc.nextInt();
        System.out.print("Enter the second side of the triangle: ");
        int side2 = sc.nextInt();
        System.out.print("Enter the third side of the triangle: ");
        int side3 = sc.nextInt();
        if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2) {
            System.out.println("The triangle is valid.");
        } else {
            System.out.println("The triangle is not valid.");
        }
    }
}
