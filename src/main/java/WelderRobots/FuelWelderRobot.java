package WelderRobots;

import RobotClass.RobotClass;

public class FuelWelderRobot extends RobotClass {
    @Override
    public void robotCanCook() {
        System.out.println("Готовить это для девченок, может подстрелим кого-нибудь?");
    }
    @Override
    public void robotCanShoot() {
        System.out.println("Давай лучше сварю тебе пушку");
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

