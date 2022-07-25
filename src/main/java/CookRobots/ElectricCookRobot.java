package CookRobots;

import RobotClass.RobotClass;

public class ElectricCookRobot extends RobotClass {

    @Override
    public void robotCanShoot() {
        System.out.println("Я так не могу, может маффин?(");
    }

    @Override
    public void robotCanWeld() {
        System.out.println("Ну нет уж, какая еще сварка");
    }

    @Override
    public void qetToAtomFuel(int robotAge) {
        System.out.println("Вот спасибо, лучевой болезни мне и не хватало");
    }

    @Override
    public void getPetrolFuel(int tankSize, int fuelLevel) {
        System.out.println("Сам пей свой бензин");
    }

}
