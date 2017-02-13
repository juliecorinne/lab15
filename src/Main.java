import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String country = " ";
        int input = 0;

        System.out.println("Welcome to this super useful Country App!");
        input = CountriesApp.rules();


        if (input == 1){
            System.out.println(CountriesTextFile.readTextFromFile("countries.txt"));
        } else if (input == 2){
            System.out.println("Please enter a country: ");
            country = scan.nextLine();
            CountriesTextFile.writeTextToFile("countries.txt", country);
            System.out.println(CountriesTextFile.readTextFromFile("countries.txt"));
        } else {
            System.out.println("Bye!");
        }




    }
}
