import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class WithProblemsTests {

    private String CONST = "const";
    private final static String bd = "pui";


    @Test
    public void equalsOneToOne(){
        assertEquals("1", "1");
    }


    @Test
    public void assignValueToConstVar(){
        CONST = "newValue";
        assertEquals("newValue", CONST);
    }

    @Test
    public void equalsOneToOne1(){
        assertEquals(1, 1);
    }


    @Test
    public void stringsMustBeEquals(){
        String res = "a";

        if (bd.equals(new String("pui"))) {
            res = "asd";
        }

        assertEquals("asd", res);
    }

    @Test
    public void successfullyRemovingFirstElementFromList(){
        List<String> sourceData = new ArrayList<>(List.of("1", "viskas", "chupocabra"));
        sourceData.remove("1");
        assertFalse(sourceData.contains("1"));
    }


}
