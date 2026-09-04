package Java_Programming;
import java.util.Scanner;
public class MonthDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month number (1-12): ");
        int month = sc.nextInt();
        int days = 0;
        boolean validMonth = true;

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31;
                break;
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            case 2:
                days = 28; // Assuming a non-leap year
                break;
            default:
                System.out.println("Invalid month number.");
                validMonth = false;
        }

        if (validMonth) {
            System.out.println("The number of days in month " + month + " is: " + days);
        }
    }
}
