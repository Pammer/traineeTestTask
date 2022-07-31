import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ReadFileTests {

    @Test
    public void secondLineShouldHabAlloha() {
        ClassLoader classLoader = this.getClass().getClassLoader();
        File file = new File(classLoader.getResource("ReadFileTests.txt").getFile());
        String line = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(file, StandardCharsets.UTF_8))) {

            int counter = 0;
            while ((line = reader.readLine()) != null) {
                counter++;
                if (counter == 2) {
                    assertEquals("аллоха", line);
                }
            }
        } catch (IOException e) {
            //
        }
    }
}
