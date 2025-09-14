
/**
 * Write a description of class chall2 here.
 *
 * @WanhongHe(your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class ProgChall2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName =keyboard.nextLine();

        System.out.print("Enter your middle name: ");
        String middleName = keyboard.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = keyboard.nextLine();

        char firstInit = firstName.charAt(0);
        char middleInit = middleName.charAt(0);
        char lastInit = lastName.charAt(0);

        System.out.println("My name is: " + firstName + " " + middleName + " " + lastName);
        System.out.println("My initials are: " + firstInit + middleInit + lastInit);

        keyboard.close();
    }
}

