import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;


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
    public void equalsOne_ToOne(){
        assertEquals(1, 1);
    }



    @Test
    public void stringsMustBeEquals(){
        String res = "asd";

        if (bd == new String("pui")) {
            res = "asd";
        }

        assertEquals("asd", res);
    }

    @Test
    public void successRemovingFirstElementFromList(){
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("1");
        myList.add("viskas");
        myList.add("hupocabra");
        myList.remove(0);
        
        assertFalse(myList.contains("1"));
    }


}
