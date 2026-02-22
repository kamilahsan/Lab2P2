import java.util.Scanner;

/**
 * Asks the user for a meal amount, calculate tax and tip and display it with total cost
 * 
 * @author Kamil Ahsan
 * @version v1.0
 * @since 2/20/2026
 */

public class ProChall13 {
    public static void main (String[] args) {
        double meal, total, taxAmount, tipAmount;
        final double TAX = 0.0675;
        final double TIP = 0.20;

        Scanner console = new Scanner(System.in);

        System.out.print("Enter meal amount: $");
        meal = console.nextDouble();
        taxAmount = meal * TAX;
        tipAmount = meal * TIP;
        total = meal + taxAmount + tipAmount;

        System.out.printf("\nThe tax is: $%,.2f", taxAmount);
        System.out.printf("\nThe tip amount is: $%,.2f", tipAmount);
        System.out.printf("\nThe meal cost with tax and tip is: $%,.2f", total);

        console.close();
    }
}