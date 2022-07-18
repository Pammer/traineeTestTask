package FightRobots;

import RobotClass.RobotClass;

public class ElectricFightRobot extends RobotClass {

    private String weapon;
    public ElectricFightRobot(String weapon) {
        this.weapon = weapon;
    }
    @Override
    public void robotCanCook() {
        System.out.println("Готовить это для девченок, может подстрелим кого-нибудь?");
    }

    @Override
    public void robotCanWeld() {
        System.out.println("Пиу пиу мазафака, я могу только стрелять - сварка для слабаков");
    }

    @Override
    public void getPetrolFuel(int tankSize, int fuelLevel) {
        System.out.println("Сам пей свой бензин");
    }

    @Override
    public void qetToAtomFuel(int robotAge) {
            System.out.println("Вот спасибо, лучевой болезни мне и не хватало");
        }
    }

