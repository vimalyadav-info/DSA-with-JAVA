
import java.util.Scanner;

public class TaxCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your income: ");
        double income = sc.nextDouble();

        double tax;

        if (income < 500000) {
            tax = income ;
        } else if (income <= 1000000) {
            tax = income * 0.20;
        } else {
            tax = income * 0.30;
        }

        System.out.println("Your tax amount is: " + tax);
        double totalIncome = income + tax;
        System.out.println("Your total income is: " + totalIncome);

        sc.close();
    }
}
