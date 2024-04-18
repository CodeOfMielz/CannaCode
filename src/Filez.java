import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Filez {

    public static void readLinesFromFile(String filePath, ArrayList<String> lines) {
        // Try-with-resources to automatically close the resources
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            // Read lines until end of file
            while ((line = br.readLine()) != null) {
                // Add line to the ArrayList
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
