package Java_Programming;
import java.util.Scanner;
public class Percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the obtained marks: ");
        double obtained = sc.nextDouble();
        System.out.print("Enter the total marks: ");
        double total = sc.nextDouble();
        double percentage = (obtained / total) * 100;
        System.out.println("The percentage is: " + percentage + "%");
    }
}
