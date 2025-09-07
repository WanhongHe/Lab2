
/**javadoc description
* @whe001@student.sdccd.edu
* @version v1.0
* @since 9/6/2025  //Replit (name, v1.0)
*/
 
public class Imprecision{
   public static void main(String[ ] args) {
        double x,y,z;
        x=12345.6789e200;
        y = 1 / x;
        z = x * y;
        
        System.out.println("The value of x is: " + x);
        System.out.println("The value of y is: " + y);
        System.out.println("The value of z (x*y) is: " + z);
        System.out.println("The value of 1 - z is: " + (1 - z));
    
    }
}
