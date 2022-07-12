import org.junit.jupiter.api.Test;
import qa.AtomicEnergy;
import qa.ElectricEnergy;
import qa.FuelEnergy;
import qa.WarBot;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class WarBotTests {

    WarBot warbot = new WarBot();
    @Test
    public void getWarBotAbilities() throws Exception {
        assertEquals("I go!", warbot.go());
        assertEquals("I go fast!", warbot.goFast());
        assertEquals("I fly!", warbot.fly());
        assertEquals(true, warbot.haveShootAbility());
        assertEquals(true, warbot.haveWeapons());
    }

    AtomicEnergy atomicEnergyBot = new WarBot();

    @Test
    public void getAtomicFuel() throws Exception {
        atomicEnergyBot.fillReactor(50);
        Boolean actual = atomicEnergyBot.refillAtom(50);
        assertEquals(true, actual);
    }

    FuelEnergy fuelEnergyBot = new WarBot();

    @Test
    public void getOilFuel() throws Exception {
        fuelEnergyBot.fillFuel(0);
        int actual = fuelEnergyBot.refillFuel(0);
        assertEquals(200, actual);
    }

    ElectricEnergy electricEnergyBot = new WarBot();

    @Test
    public void getElectricity() throws Exception {
        electricEnergyBot.fillElectricity(19);
        int actual = electricEnergyBot.refillElectricity(19);
        assertEquals(100, actual);
    }


}








