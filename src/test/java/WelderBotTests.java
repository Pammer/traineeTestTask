import org.junit.jupiter.api.Test;
import qa.AtomicEnergy;
import qa.ElectricEnergy;
import qa.FuelEnergy;
import qa.WelderBot;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WelderBotTests {

    WelderBot welderBot = new WelderBot();

    @Test
    public void getWelderBotAbilities() throws Exception {
        assertEquals("I go!", welderBot.go());
        assertEquals("I go fast!", welderBot.goFast());
        assertEquals("I fly!", welderBot.fly());
        assertEquals(true, welderBot.haveWelderAbility());
    }


    AtomicEnergy atomicEnergyBot = new WelderBot();

    @Test
    public void getAtomicFuel() throws Exception {
        atomicEnergyBot.fillReactor(50);
        Boolean actual = atomicEnergyBot.refillAtom(50);
        assertEquals(true, actual);
    }

    FuelEnergy fuelEnergyBot = new WelderBot();

    @Test
    public void getOilFuel() throws Exception {
        fuelEnergyBot.fillFuel(0);
        int actual = fuelEnergyBot.refillFuel(0);
        assertEquals(200, actual);
    }

    ElectricEnergy electricEnergyBot = new WelderBot();

    @Test
    public void getElectricity() throws Exception {
        electricEnergyBot.fillElectricity(19);
        int actual = electricEnergyBot.refillElectricity(19);
        assertEquals(100, actual);
    }
}
