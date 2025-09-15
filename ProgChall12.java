import java.util.Scanner;
/**
 *  Prochall12 class does the following
 *  Asks the user to enter a city Displays the number of characters in the city name
 *  Displays the city name in upper case and lower case
 *  Displays the first character of the city name
 *
 * @author WanhongHe
 * @version v1.0 
 * @since 2025-09-14
 */

public class ProgChall12 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // Get input
        System.out.print("Enter a city: ");
        String city = keyboard.nextLine();

        // Output results
        System.out.println("The city entered has: " + city.length() + " chars");
        System.out.println("In upper case: " + city.toUpperCase());
        System.out.println("In lower case: " + city.toLowerCase());
        System.out.println("First character: " + city.charAt(0));

    keyboard.close();
    }
}
