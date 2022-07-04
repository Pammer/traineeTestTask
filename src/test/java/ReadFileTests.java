import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ReadFileTests {

    @Test
    public void secondLineShouldHabAlloha() throws IOException {

        String expected_value = "аллоха";

        String line2 = Files.readAllLines(Paths.get("src/test/resources/ReadFileTests.txt")).get(1);
        assertEquals(expected_value, line2);

    }
}
