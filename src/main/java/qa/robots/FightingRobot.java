package qa.robots;

/**
 * FightingRobot - класс боевого робота.
 * Наследуется от класса Robot
 * ООП принцип - Наследование
 */
public class FightingRobot extends Robot {

    /**
     * Метод, позволяющий роботу стрелять
     */
    public void shoot(){
        System.out.println("FightingRobot shoots a gun");
    }

    public void fight(){
        System.out.println("FightingRobot fighting with a sword");
    }
}
