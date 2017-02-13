import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int input = 0;

        System.out.println("Welcome to this super useful Country App!");

        boolean countryList = true;

        while (countryList) {

            input = CountriesApp.rules();
            System.out.println();

            countryList = ifElseForUser(scan, input);
        }

        CountriesApp.userPickThree(input);

    }

    public static boolean ifElseForUser(Scanner scan, int input) {

        boolean countryList;
        if (input == 1) {

            countryList = pickOne(scan, input);

        } else if (input == 2) {

            countryList = pickTwo(scan, input);

        } else {
            countryList = false;
        }
        return countryList;
    }

    public static boolean pickTwo(Scanner scan, int input) {

        String userInput;
        boolean countryList;
        CountriesApp.userPickTwo(input);

        System.out.println("Would you like to try another command? y/n");
        userInput = scan.nextLine();

        if (userInput.equalsIgnoreCase("y")) {
            countryList = true;
        } else {
            countryList = false;
        }
        return countryList;
    }

    public static boolean pickOne(Scanner scan, int input) {

        String userInput;
        boolean countryList;
        CountriesApp.userPickOne(input);

        System.out.println("Would you like to try another command? y/n");
        userInput = scan.nextLine();

        if (userInput.equalsIgnoreCase("y")) {
            countryList = true;
        } else {
            countryList = false;
        }
        return countryList;
    }
}
