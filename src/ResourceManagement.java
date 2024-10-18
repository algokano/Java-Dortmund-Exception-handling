import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ResourceManagement {

    public void readFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            System.out.println("First line: " + reader.readLine());
        } catch (IOException e) {
            System.out.println("Exception during resource management: " + e);
        }
    }
}
