
/**
 * Using Scanner to ask for first, middle, and last name. Then stating name and initials
 *
 * @author Kamil Ahsan
 * @version v1.0
 * @since 2/20/2026
 */
import java.util.Scanner;

public class ProgChall2 {
    public static void main(String[] args) {
        
        Scanner console = new Scanner(System.in);
        
        System.out.print("Enter your first name: ");
        String firstName = console.next();
        
        System.out.print("Enter your middle name: ");
        String middleName = console.next();
        
        System.out.print("Enter your last name: ");
        String lastName = console.next();
        
        char firstInit = firstName.charAt(0);
        char middleInit = middleName.charAt(0);
        char lastInit = lastName.charAt(0);
        
        System.out.println();
        System.out.println("My name is: " + firstName + " " + middleName + " " + lastName);
        System.out.println("My initials are: " + firstInit + "" + middleInit + "" + lastInit);
        
        console.close();
    }
}