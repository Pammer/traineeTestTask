
import java.util.ArrayList;
import java.util.Arrays;
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
    public void equalsOneToOneNumbers(){
        assertEquals(1, 1);
    }



    @Test
    public void stringsMustBeEquals(){
        String res = "a";

        if (bd.equals("pui")) {
            res = "asd";
        }

        assertEquals("asd", res);
    }

    @Test
    public void successfullyRemovingFirstElementFromList() {

            ArrayList<String> sourceData = new ArrayList<>();
            sourceData.add("1");
            sourceData.add("viskas");
            sourceData.add("chupocabra");
            if (sourceData.size() > 0) {
                sourceData.remove(0);
            }

            assertFalse(sourceData.contains("1"));
        }



}
