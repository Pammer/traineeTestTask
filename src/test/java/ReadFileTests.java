import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFileTests {

    @Test
    public void secondLineShouldHabAlloha() {
        //write here second task

        String str;
        try {
            str = Files.readAllLines(Paths.get("src/test/resources/ReadFileTests.txt")).get(1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Assertions.assertTrue(str.contains("аллоха"));

    }
}
