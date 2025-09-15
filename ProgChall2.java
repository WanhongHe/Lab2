import java.util.Scanner;

/**
 * ProgChall2 class does the following:
 *  1)Asks the user for first, middle, and last name
 *  2)Displays the full name
 *  3)Displays the initials
 *
 * @author WanhongHe
 * @version v1.0 
 * @since 2025-09-13
 */
public class ProgChall2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        String firstName;
        String middleName;
        String lastName;
        char firstInit;
        char middleInit;
        char lastInit;
        

        // Get input
        System.out.print("Enter your first name: ");
        firstName =keyboard.nextLine();

        System.out.print("Enter your middle name: ");
        middleName = keyboard.nextLine();

        System.out.print("Enter your last name: ");
        lastName = keyboard.nextLine();

        // Create initials
        firstInit = firstName.charAt(0);
        middleInit = middleName.charAt(0);
        lastInit = lastName.charAt(0);

        // Print output
        System.out.println("\nMy name is: " + firstName + " " + middleName + " " + lastName);
        System.out.println("My initials are: " + firstInit + middleInit + lastInit);

    }
}

