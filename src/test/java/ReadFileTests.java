import org.junit.jupiter.api.Test;

public class ReadFileTests {

    @Test
    public void secondLineShouldHabAlloha(){
      //write here second task
      //read file and print text  
    File file = new File("ReadFileTests.txt");
    Scanner sc = new Scanner(file);

    while(sc.hasNext()) {
	System.out.println(sc.next());
    }
  }
}
