package Java_Programming;

import java.util.Scanner;

public class CollinearPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1, y1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        System.out.print("Enter x2, y2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        System.out.print("Enter x3, y3: ");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();
        //Condition kyy hoti h collinear points ke liye slope of AB = slope of BC cross multiply is liye kr dia deno mei zero bnega nii to uske liye alg se condition likhni pdegi
        if ((y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1)) {
            System.out.println("Points are Collinear");
        } else {
            System.out.println("Points are NOT Collinear");
        }
    }
}