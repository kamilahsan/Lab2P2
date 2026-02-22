import java.util.Scanner;

/**
 * Promptrs for city name as input, displays # of characters in name, name of city in uppercase, name of city in lowercase, and first character in city name
 *
 * @author Name, optional email
 * @version v1.0
 * @since date
 */

public class ProChall12 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.print("Enter a city: ");
        String city = console.nextLine();

        char firstChar = city.charAt(0);

        System.out.println("\nThe city entered has: " + city.length() + " chars");
        System.out.println("In upper case: " + city.toUpperCase());
        System.out.println("In lower case: " + city.toLowerCase());
        System.out.println("First character: " + firstChar);

        console.close();
    }
}