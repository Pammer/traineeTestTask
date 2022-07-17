import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class WithProblemsTests {

    private final static String bd = "pui";

    @Test
    public void equalsOneToOne() {
        assertEquals("1", "1");

    }


    @Test
    public void assignValueToConstVar() {
        String CONST = "newValue";
        assertEquals("newValue", CONST);

    }

    @BeforeAll
    public static void equalsStaticOneToOne() {

        assertEquals(1, 1);

    }


    @Test
    public void stringsMustBeEquals() {
        String res = "a";

        if (bd.equals(new String("pui"))) {
            res = "asd";
        }

        assertEquals("asd", res);

    }

    @Test
    public void successfullyRemovingFirstElementFromList() {
        List<String> sourceData = new ArrayList<>(List.of("1", "viskas", "chupocabra"));
        Iterator<String> dataIterator = sourceData.iterator();
        while (dataIterator.hasNext()) {
            System.out.println(dataIterator.next());
            dataIterator.remove();
        }

        assertFalse(sourceData.contains("1"));

    }

}
