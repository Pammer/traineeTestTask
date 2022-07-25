package FightRobots;

import RobotClass.RobotClass;

public class FuelFightRobot extends RobotClass {
    private String weapon;
    public FuelFightRobot(String weapon) {
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
        public void qetToAtomFuel(int robotAge) {
            System.out.println("Вот спасибо, лучевой болезни мне и не хватало");
        }

    @Override
    public void getRecharging(int electricLevel) {
        System.out.println("Я похож на тостер?");
    }



}

