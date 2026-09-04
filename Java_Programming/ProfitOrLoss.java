package Java_Programming;
import java.util.Scanner;
public class ProfitOrLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cost price: ");
        double cp = sc.nextDouble();
        System.out.print("Enter the selling price: ");
        double sp = sc.nextDouble();
        if (sp > cp) {
            double profit = sp - cp;
            System.out.println("Profit: " + profit);
        } else if (cp > sp) {
            double loss = cp - sp;
            System.out.println("Loss: " + loss);
        } else {
            System.out.println("No profit, no loss.");
        }
    }
}
