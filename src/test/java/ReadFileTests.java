

import org.junit.jupiter.api.Test;

import java.io.FileReader;
import java.io.IOException;



public class ReadFileTests {
        @Test
        public void secondLineShouldHabAlloha(){

            try (FileReader reader = new FileReader("src/test/resources/ReadFileTests.txt")) {
                // читаем посимвольно
                int c;
                while ((c = reader.read()) != -1) {

                    System.out.print((char) c);
                }
            } catch (IOException ex) {

                System.out.println(ex.getMessage());
            }
        }
        }
