import java.util.Scanner;

/**
 * Created by julieschneider on 2/13/17.
 */
public class CountriesApp extends CountriesTextFile{

    public static int rules(){

        Scanner scan = new Scanner(System.in);
        int input = 0;

        System.out.println("Here is the menu: ");
        System.out.println("1. Display a list of countries.");
        System.out.println("2. Enter a Country to add to the list.");
        System.out.println("3. Quit.");
        input = scan.nextInt();

        if (input == 0){

        }

        return input;

    }

}
