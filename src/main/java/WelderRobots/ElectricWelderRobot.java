package WelderRobots;

import RobotClass.RobotClass;

public class ElectricWelderRobot extends RobotClass {

    @Override
    public void robotCanCook() {
        System.out.println("Готовить это для девченок, может подстрелим кого-нибудь?");
    }
    @Override
    public void robotCanShoot() {
        System.out.println("Давай лучше сварю тебе пушку");
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
