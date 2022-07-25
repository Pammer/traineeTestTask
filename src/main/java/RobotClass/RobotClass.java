package RobotClass;

import AbstractClass.AbstractRobot;

public abstract class RobotClass extends AbstractRobot {
    //здесь у меня будут все возможные функции роботов
    public void robotCanShoot() {
        System.out.println("Робот умеет стрелять");
    }

    public void robotCanCook() {
        System.out.println("Робот умеет готовить");
    }

    public void robotCanWeld() {
        System.out.println("Робот умеет варить железо");
    }

    public void qetToAtomFuel(int robotAge) {
        if(robotAge % 50 == 0) {
            System.out.println("Роботу пора заправиться");
        }
        else {
            System.out.println("Заправляться еще рано");
        }
    }

    public void getRecharging(int electricLevel) {
        if(electricLevel < 20) {
            System.out.println("Роботу пора заправиться");
        }
        else {
            System.out.println("Заправляться еще рано");
        }
    }

    public void getPetrolFuel(int tankSize, int fuelLevel) {
        if (tankSize <= 50) {
            if (fuelLevel > 5) {
                System.out.println("Заправляться еще рано");
            } else {
                System.out.println("Роботу пора заправиться");
            }
        }
        if ((tankSize > 50) && (tankSize <= 80)) {
            if (fuelLevel > 20) {
                System.out.println("Заправляться еще рано");
            } else {
                System.out.println("Роботу пора заправиться");
            }
        }
        if (tankSize > 80) {
            if (fuelLevel > 30) {
                System.out.println("Заправляться еще рано");
            } else {
                System.out.println("Роботу пора заправиться");
            }

        }
    }

}
