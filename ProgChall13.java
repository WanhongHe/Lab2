import java.util.Scanner;
/**
 * ProChall13 class dose the following
 * 1)Asks the user to enter the amount of a meal.
 * 2)Calculates the tax (6.75%) and the tip (20%). 
 * 3) Displays the tax, tip, and total cost
 *
 * @WanhongHe
 * @version v1.0 
 * @since 2025-09-14
 */

public class ProgChall13 {
    public static void main(String[] args) {
        double meal,taxAmount,tipAmount,total;
        final double TAX_RATE = 0.0675;
        final double TIP_RATE = 0.20; 
        
        //Create a Scanner object to get keyboard input
        Scanner keyboard = new Scanner(System.in);

        //Get input
        System.out.print("Enter meal amount: $");
        //assign meal var with a double from the Scanner object
        meal = keyboard.nextDouble();

        //assign taxAmount var with meal * TAX_RATE
        taxAmount = meal * TAX_RATE;
        //assign tipAmount var with meal * TIP_RATE
        tipAmount = meal * TIP_RATE;
        //assign total var with meal + taxAmount + tipAmount 
        total = meal + taxAmount + tipAmount;

        System.out.printf("\nThe tax is: $%.2f", taxAmount);
        System.out.printf("\nThe tip is: $%.2f", tipAmount);
        System.out.printf("\nThe meal cost with tax and tip is: $%.2f", total);

    }
}
