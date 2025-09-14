
/**
 * Write a description of class ProgChall15 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.JOptionPane;

public class ProgChall15 {
    public static void main(String[] args) {
        final double COMMISSION_RATE = 0.02; // 2% commission

        // Ask user for price per share
        String priceInput = JOptionPane.showInputDialog("Enter the price per share:");
        double pricePerShare = Double.parseDouble(priceInput);

        // Ask user for number of shares
        String sharesInput = JOptionPane.showInputDialog("Enter the number of shares:");
        int shares = Integer.parseInt(sharesInput);

        // Calculations
        double stockCost = pricePerShare * shares;
        double commission = stockCost * COMMISSION_RATE;
        double total = stockCost + commission;

        // Show result in a dialog box
        String message = String.format(
            "The commission is: $%.2f\nThe total paid is: $%.2f",
            commission, total
        );

        JOptionPane.showMessageDialog(null, message, "Stock Transaction", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0); // Close the program properly
    }
}
