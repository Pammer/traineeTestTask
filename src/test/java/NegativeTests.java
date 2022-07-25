import CookRobots.ElectricCookRobot;
import FightRobots.AtomFightRobot;
import org.junit.jupiter.api.Test;


public class NegativeTests {


    @Test
    public void fightRobotCantCook() {
        AtomFightRobot fightRobot = new AtomFightRobot("sword");
        fightRobot.robotCanCook();
    }

    @Test
    public void electricRobotCantGetPetrol() {
        ElectricCookRobot electricCookRobot = new ElectricCookRobot();
        electricCookRobot.getPetrolFuel(35, 10);
    }


}
