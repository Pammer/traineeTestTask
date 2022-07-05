import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WithProblemsTests {

    private String CONST = "const";
    private final static String bd = "pui";

    @Test
    public void equalsOneToOneString(){
        assertEquals("1", "1");
    }


    @Test
    public void assignValueToConstVar(){
        CONST = "newValue";
        assertEquals("newValue", CONST);
    }

    @Test
    public static void equalsOneToOne(){
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
        ArrayList sourceData = new ArrayList(Arrays.asList("1", "viskas", "chupocabra"));

        sourceData.remove(0);

        assertFalse(sourceData.contains("1"));
    }


}
