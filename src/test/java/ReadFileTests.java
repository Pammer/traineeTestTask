import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileTests {

    @Test
    public void secondLineShouldHabAlloha() throws FileNotFoundException {
        String path = "src/test/resources/ReadFileTests.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            if (scanner.nextLine().contains("аллоха")) {
                System.out.println(true);
            }
            else {
                System.out.println(false);
            }
        }
        scanner.close();
    }
}



