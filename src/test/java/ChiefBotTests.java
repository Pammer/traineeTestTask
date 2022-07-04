import org.junit.jupiter.api.Test;
import qa.AtomicEnergy;
import qa.ElectricEnergy;
import qa.FuelEnergy;
import qa.ChiefBot;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChiefBotTests {

    ChiefBot chiefBot = new ChiefBot();
    @Test
    public void getWarBotAbilities() throws Exception {
        assertEquals("I go!", chiefBot.go());
        assertEquals("I go fast!", chiefBot.goFast());
        assertEquals("I fly!", chiefBot.fly());
        assertEquals(true, chiefBot.haveCookAbility());
    }

    AtomicEnergy atomicEnergyBot = new ChiefBot();

    @Test
    public void getAtomicFuel() throws Exception {
        atomicEnergyBot.fillReactor(50);
        Boolean actual = atomicEnergyBot.refillAtom(50);
        assertEquals(true, actual);
    }

    FuelEnergy fuelEnergyBot = new ChiefBot();

    @Test
    public void getOilFuel() throws Exception {
        fuelEnergyBot.fillFuel(0);
        int actual = fuelEnergyBot.refillFuel(0);
        assertEquals(200, actual);
    }

    ElectricEnergy electricEnergyBot = new ChiefBot();

    @Test
    public void getElectricity() throws Exception {
        electricEnergyBot.fillElectricity(19);
        int actual = electricEnergyBot.refillElectricity(19);
        assertEquals(100, actual);
    }

}
