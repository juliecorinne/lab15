import java.util.Scanner;

/**
 * Created by julieschneider on 2/13/17.
 */
public class CountriesApp {

    public static int rules(){

        Scanner scan = new Scanner(System.in);
        int input = 0;

        System.out.println("Here is the menu: ");
        System.out.println("1. Display a list of countries.");
        System.out.println("2. Enter a Country to add to the list.");
        System.out.println("3. Quit.");
        input = Validation.rangeValidator(1,3);

        return input;

    }

    public static void userPickOne(int input){

        if (input == 1){
            System.out.println(CountriesTextFile.readTextFromFile("countries.txt"));
        }

    }

    public static void userPickTwo(int input){

        Scanner scan = new Scanner(System.in);
        String country = " ";

        if (input == 2){
            System.out.println("Please enter a country: ");
            country = scan.nextLine();
            CountriesTextFile.writeTextToFile("countries.txt", country);
            System.out.println("This country has been added!");
            System.out.println();
        }
    }

    public static void userPickThree(int input){
        System.out.println("Bye!");
    }

}
