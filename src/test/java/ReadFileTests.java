import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.junit.jupiter.api.Test;

public class ReadFileTests {

    @Test
    public void secondLineShouldHabAlloha() throws IOException {
      File file = new File("src/test/resources/ReadFileTests.txt");
      BufferedReader br = new BufferedReader(new FileReader(file));
      String s;
      while((s=br.readLine())!=null){
                      
        System.out.println(s);
       }
       br.close();
       
    assertEquals("аллоха", s);
      
    }
  } 
