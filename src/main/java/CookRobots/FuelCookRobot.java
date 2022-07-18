package CookRobots;

import RobotClass.RobotClass;

public class FuelCookRobot extends RobotClass {


    @Override
    public void robotCanShoot() {
        System.out.println("Я так не могу, может маффин?(");
    }

    @Override
    public void robotCanWeld() {
        System.out.println("Ну нет уж, какая еще сварка");
    }

    @Override
    public void getRecharging(int electricLevel) {
        System.out.println("Я похож на тостер?");
    }

    @Override
    public void qetToAtomFuel(int robotAge) {
        System.out.println("Вот спасибо, лучевой болезни мне и не хватало");
    }


    }


