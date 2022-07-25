package FightRobots;

import RobotClass.RobotClass;

public class AtomFightRobot extends RobotClass {
    private String weapon;
    public AtomFightRobot(String weapon) {
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
    public void getRecharging(int electricLevel) {
            System.out.println("Я похож на тостер?");
        }

    @Override
public void getPetrolFuel(int tankSize, int fuelLevel) {
    System.out.println("Сам пей свой бензин");
}

}


