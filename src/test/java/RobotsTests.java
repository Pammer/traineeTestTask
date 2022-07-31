import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import qa.Robots.CookerRobot;
import qa.Robots.WarriorRobot;
import qa.Robots.WelderRobot;
import qa.fuel.AtomFuel;
import qa.fuel.ElectricFuel;
import qa.fuel.SireFuel;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RobotsTests {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    //CookerRobot

    @Test
    public void testRobotCookerSireFuel() {
        CookerRobot robot = new CookerRobot(new SireFuel(50.0F));
        robot.cook();
        robot.stopSpecialDoing();
        robot.goRight();
        robot.goRight();
        robot.goRight();
        robot.refuel("Дизель");
        outputStreamCaptor.reset();
        robot.goForward();
        assertEquals("Успешно!", outputStreamCaptor.toString().trim());
    }

    @Test
    public void testRobotCookerElectricFuel() {
        CookerRobot robot = new CookerRobot(new ElectricFuel(40.0F));
        robot.cook();
        robot.stopSpecialDoing();
        robot.walkRight();
        robot.walkRight();
        robot.walkRight();
        outputStreamCaptor.reset();
        robot.refuel("Электричество");
        assertEquals("Заправка прошла успешно!", outputStreamCaptor.toString().trim());
    }

    @Test
    public void testRobotCookerAtomFuel() {
        CookerRobot robot = new CookerRobot(new AtomFuel());
        robot.cook();
        robot.walkRight();
        robot.stopSpecialDoing();
        outputStreamCaptor.reset();
        robot.refuel("Атомная энергия");
        assertEquals("Топлива хватает.", outputStreamCaptor.toString().trim());
    }

    //WarriorRobot

    @Test
    public void testRobotWarriorSireFuel() {
        WarriorRobot robot = new WarriorRobot(new SireFuel(50.0F));
        robot.attack();
        robot.stopSpecialDoing();
        robot.defend();
        robot.refuel("Дизель");
        outputStreamCaptor.reset();
        robot.attack();
        assertEquals("Сначала выключи Защита", outputStreamCaptor.toString().trim());
    }

    @Test
    public void testRobotWarriorElectricFuel() {
        WarriorRobot robot = new WarriorRobot(new ElectricFuel(40.0F));
        robot.flyUp();
        robot.flyDown();
        robot.refuel("Электричество");
        outputStreamCaptor.reset();
        robot.flyUp();
        assertEquals("Успешно!", outputStreamCaptor.toString().trim());
    }

    @Test
    public void testRobotWarriorAtomFuel() {
        WarriorRobot robot = new WarriorRobot(new AtomFuel());
        robot.attack();
        robot.stopSpecialDoing();
        robot.walkRight();
        robot.goForward();
        outputStreamCaptor.reset();
        robot.refuel("Атомная энергия");
        assertEquals("Топлива хватает.", outputStreamCaptor.toString().trim());
    }

    //WelderRobot

    @Test
    public void testRobotWelderSireFuel() {
        WelderRobot robot = new WelderRobot(new SireFuel(50.0F));
        robot.welder();
        robot.stopSpecialDoing();
        robot.goBack();
        robot.refuel("Дизель");
        outputStreamCaptor.reset();
        robot.goBack();
        assertEquals("Успешно!", outputStreamCaptor.toString().trim());
    }

    @Test
    public void testRobotWelderElectricFuel() {
        WelderRobot robot = new WelderRobot(new ElectricFuel(40.0F));
        robot.flyUp();
        robot.flyDown();
        robot.refuel("Электричество");
        outputStreamCaptor.reset();
        robot.flyUp();
        assertEquals("Успешно!", outputStreamCaptor.toString().trim());
    }

    @Test
    public void testRobotWelderAtomFuel() {
        WelderRobot robot = new WelderRobot(new AtomFuel());
        robot.welder();
        robot.stopSpecialDoing();
        robot.walkRight();
        robot.goForward();
        outputStreamCaptor.reset();
        robot.refuel("Атомная энергия");
        assertEquals("Топлива хватает.", outputStreamCaptor.toString().trim());
    }

    //Test incorrect refuel

    @Test
    public void testIncorrectRefuel() {
        CookerRobot robot = new CookerRobot(new ElectricFuel(20.0F));
        robot.cook();
        robot.stopSpecialDoing();
        outputStreamCaptor.reset();
        robot.refuel("Атомная энергия");
        assertEquals("Ты хочешь заправить робота чем-то странным...", outputStreamCaptor.toString().trim());
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }
}
