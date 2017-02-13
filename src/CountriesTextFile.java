import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by julieschneider on 2/13/17.
 */
public class CountriesTextFile {

    public static void writeTextToFile(String fileName, String Input){

        Path filePath = Paths.get(fileName);
        File productsFile = filePath.toFile();

        try {

            PrintWriter out = new PrintWriter(new FileOutputStream(productsFile, true)); // append = true

            out.println(Input);

            out.close();

        } catch (FileNotFoundException ex) {


        }


    }

    public static StringBuilder readTextFromFile(String fileName){

        Path filePath = Paths.get(fileName);

        File productsFile = filePath.toFile();

        StringBuilder result = new StringBuilder();

        try {
            FileReader r = new FileReader(productsFile);
            BufferedReader reader = new BufferedReader(r);

            //reader.readLine() //only reads one line, need a loop to read everything

            String line = reader.readLine();
            while (line != null){
                //System.out.println(line);
                result.append(line+"\n");
                line = reader.readLine(); //add this otherwise it is an infinite loop
            }

            reader.close();
            return result;

        } catch (FileNotFoundException ex) {

            return null;

        }
        catch (IOException ex){ //add the catch if the readline has an error

            return null;

        }


    }

}
