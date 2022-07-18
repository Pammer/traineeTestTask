package CookRobots;

import RobotClass.RobotClass;

public class AtomCookRobot extends RobotClass {

    @Override
    public void robotCanShoot() {
        System.out.println("Я так не могу, может маффин?(");
    }

    @Override
    public void robotCanWeld() {
        System.out.println("Ну нет уж, какая еще сварка");
    }

    @Override
    public void getPetrolFuel(int tankSize, int fuelLevel) {
        System.out.println("Сам пей свой бензин");
    }

    @Override
    public void getRecharging(int electricLevel) {
        System.out.println("Я похож на тостер?");
    }
}
