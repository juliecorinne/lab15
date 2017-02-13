import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String country = " ";
        int input = 0;
        String userInput = " ";

        System.out.println("Welcome to this super useful Country App!");

        boolean countryList = true;

        while (countryList) {

            input = CountriesApp.rules();
            System.out.println();

            if (input == 1) {
                System.out.println(CountriesTextFile.readTextFromFile("countries.txt"));
                System.out.println("Would you like to try another command? y/n");
                userInput = scan.nextLine();

                if (userInput.equalsIgnoreCase("y")) {
                    countryList = true;
                } else {
                    countryList = false;
                }

            } else if (input == 2) {

                System.out.println("Please enter a country: ");
                country = scan.nextLine();
                CountriesTextFile.writeTextToFile("countries.txt", country);
                System.out.println("This country has been added!");
                System.out.println();

                System.out.println("Would you like to try another command? y/n");
                userInput = scan.nextLine();

                if (userInput.equalsIgnoreCase("y")) {
                    countryList = true;
                } else {
                    countryList = false;
                }

            } else {
                countryList = false;
            }
        }

        System.out.println("Bye!");

    }
}
