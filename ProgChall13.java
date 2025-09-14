
/**
 * Write a description of class ProgChall13 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class ProgChall13 {
    public static void main(String[] args) {
        final double TAX_RATE = 0.0675; // 6.75%
        final double TIP_RATE = 0.20;   // 20%

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter meal amount: $");
        double meal = keyboard.nextDouble();

        double tax = meal * TAX_RATE;
        double tip = meal * TIP_RATE;
        double total = meal + tax + tip;

        System.out.printf("The tax is: $%.2f\n", tax);
        System.out.printf("The tip is: $%.2f\n", tip);
        System.out.printf("The meal cost with tax and tip is: $%.2f\n", total);

        keyboard.close();
    }
}
