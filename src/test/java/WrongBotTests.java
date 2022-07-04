import org.junit.jupiter.api.Test;
import qa.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class WrongBotTests {

    WrongBot wrongBot = new WrongBot();

    @Test
    public void getWrongBotAbilities() throws Exception {
        assertEquals("I go!", wrongBot.go());
        assertEquals("I go fast!", wrongBot.goFast());
        assertEquals("I fly!", wrongBot.fly());
        assertEquals(false, wrongBot.haveCookAbility());
        assertEquals(true, wrongBot.haveWelderAbility());
    }


    @Test
    public void getOilFuelWrong() throws Exception {
        wrongBot.fillFuelWrong(0);
        String actual = wrongBot.refillFuelWrong(0);
        assertEquals("200", actual, "Wrong Fuel!");
    }
}
