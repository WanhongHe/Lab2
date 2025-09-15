import java.util.Scanner;

/**
 * ProChall15 class does the following:
 * 1) Prompts the user to enter the number of shares purchased
 * 2) Prompts the user to enter the price per share
 * 3) Calculates the total cost of shares
 * 4) Calculates the commission at 2% of the total cost
 * 5) Calculates the overall total (shares + commission)
 * 6) Displays the results (total cost of shares, commission, and overall total)
 * 
 * @author WanhongHe
 * @version v1.0
 * @since 2025-9-13
 */

public class ProChall15 {
    public static void main (String[] args){
        // Variables
        int numShares;
        double pricePerShare, totalCostShares, commission, total;

        // create a constant (final double) for COMM_RATE set to 2% 
        final double COMMISSION_RATE = 0.02;

        // Create Scanner object
        Scanner keyboard = new Scanner(System.in);

        // Get input
        System.out.print("Enter number of shares purchased: ");
        numShares = keyboard.nextInt();
        System.out.print("Enter price per share: ");
        pricePerShare = keyboard.nextDouble();

        // Computations
        totalCostShares = numShares * pricePerShare;
        commission = totalCostShares * COMMISSION_RATE;
        total = totalCostShares + commission;

        // Display output
        System.out.printf("Total cost of shares are: $%,.2f\nCommission cost is: $%,.2f\nTotal Cost is: $%,.2f",totalCostShares, commission, total);
    }
}
