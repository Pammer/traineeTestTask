import CookRobots.AtomCookRobot;
import CookRobots.ElectricCookRobot;
import CookRobots.FuelCookRobot;
import FightRobots.AtomFightRobot;
import FightRobots.ElectricFightRobot;
import FightRobots.FuelFightRobot;
import WelderRobots.AtomWelderRobot;
import WelderRobots.ElectricWelderRobot;
import WelderRobots.FuelWelderRobot;
import org.junit.jupiter.api.Test;



public class PositiveTest {


    @Test
    public void fightRobotCanShootAndGetAtomFuel() {
        AtomFightRobot atomFightRobot = new AtomFightRobot("sword");
        atomFightRobot.robotCanShoot();
        atomFightRobot.qetToAtomFuel(50);
    }
    @Test
    public void fightRobotCanShootAndGetPetrolFuel() {
        FuelFightRobot fuelFightRobot = new FuelFightRobot("flamethrower");
        fuelFightRobot.robotCanShoot();
        fuelFightRobot.getPetrolFuel(25, 3);
    }

    @Test
    public void fightRobotCanShootAndGetElectricity() {
        ElectricFightRobot electricFightRobot = new ElectricFightRobot("light-saber");
        electricFightRobot.robotCanShoot();
        electricFightRobot.getRecharging(35);
    }

    @Test
    public void cookRobotCanCookAndGetAtomFuel() {
        AtomCookRobot atomCookRobot = new AtomCookRobot();
        atomCookRobot.robotCanCook();
        atomCookRobot.qetToAtomFuel(50);
    }

    @Test
    public void cookRobotCanCookAndGetPetrol() {
        FuelCookRobot fuelCookRobot = new FuelCookRobot();
        fuelCookRobot.robotCanCook();
        fuelCookRobot.getPetrolFuel(25, 4);
    }

    @Test
    public void cookRobotCanCookAndGetElectricity() {
        ElectricCookRobot electricCookRobot = new ElectricCookRobot();
        electricCookRobot.robotCanCook();
        electricCookRobot.getRecharging(25);
    }

    @Test
    public void welderRobotCanWeldAndGetAtom() {
        AtomWelderRobot atomWelderRobot = new AtomWelderRobot();
        atomWelderRobot.robotCanWeld();
        atomWelderRobot.qetToAtomFuel(15);
    }

    @Test
    public void welderRobotCanWeldAndGetPetrol() {
        FuelWelderRobot fuelWelderRobot = new FuelWelderRobot();
        fuelWelderRobot.robotCanWeld();
        fuelWelderRobot.getPetrolFuel(125, 20);
    }

    @Test
    public void welderRobotCanWeldAndGetElectricity() {
        ElectricWelderRobot electricWelderRobot = new ElectricWelderRobot();
        electricWelderRobot.robotCanWeld();
        electricWelderRobot.getRecharging(12);
    }
}



