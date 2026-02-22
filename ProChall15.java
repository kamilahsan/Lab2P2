import java.util.Scanner;

/**
 * Asks for number of shares and price per share, calculates the total cost of shares, commission, and total cost
 *
 * @author Kamil Ahsan
 * @version v1.0
 * @since 2/20/2026
 */

public class ProChall15 {
    public static void main (String[] args) {
        double pricePerShare, totalCostShares, commission, total;
        int numberOfShares;
        final double COMM_RATE = 0.02;

        Scanner console = new Scanner(System.in);

        System.out.print("Enter number of shares purchased: ");
        numberOfShares = console.nextInt();

        System.out.print("Enter price per share: $");
        pricePerShare = console.nextDouble();

        totalCostShares = numberOfShares * pricePerShare;
        commission = totalCostShares * COMM_RATE;
        total = totalCostShares + commission;

        System.out.printf("Total cost of shares are: $%,.2f\nCommission cost is: $%,.2f\nTotal Cost is: $%,.2f", totalCostShares, commission, total);
        console.close();
    }
}
        