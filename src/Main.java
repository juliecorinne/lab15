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

                CountriesApp.userPickOne(input);

                System.out.println("Would you like to try another command? y/n");
                userInput = scan.nextLine();

                if (userInput.equalsIgnoreCase("y")) {
                    countryList = true;
                } else {
                    countryList = false;
                }

            } else if (input == 2) {

                CountriesApp.userPickTwo(input);

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

        CountriesApp.userPickThree(input);

    }
}
