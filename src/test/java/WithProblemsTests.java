import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WithProblemsTests {

    private static final String CONST = "newValue";
    private static final String bd = "pui";

    @Test
    public void testEqualsOneToOneString() {
        assertEquals("1", "1");
    }

    @Test
    public void testAssignValueToConstVar() {

        assertEquals(new String("newValue"), CONST);
    }

    @Test
    public void testEqualsOneToOneShort() {
        assertEquals(1, 1);
    }

    @Test
    public void testStringsMustBeEquals() {
        String res = "a";

        if (bd.equals(new String("pui"))) {
            res = "asd";
        }

        assertEquals("asd", res);
    }

    @Test
    public void testSuccessfullyRemovingFirstElementFromList() {
        List<String> sourceData = new ArrayList<>();
        sourceData.add("1");
        sourceData.add("viskas");
        sourceData.add("chupocabra");

        List<String> copySourceData = new ArrayList<>(sourceData);

        for (String element : copySourceData) {
            if (element.equals("1")) {
                sourceData.remove(element);
            }
        }
        assertFalse(sourceData.contains("1"));
    }


}
