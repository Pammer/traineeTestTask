package qa;

import qa.energy.Energy;
import qa.robots.ChefRobot;
import qa.robots.FightingRobot;
import qa.robots.WelderRobot;

public class Main {
    public static void main(String[] args) {

        //боевые роботы показывают все виды действий и заправку различными видами энергии
        FightingRobot fightingRobot_1 = new FightingRobot();
        fightingRobot_1.shoot();
        fightingRobot_1.fight();
        fightingRobot_1.drive();
        fightingRobot_1.fly();
        fightingRobot_1.walk();
        fightingRobot_1.refuel(Energy.ATOMIC, 45);

        FightingRobot fightingRobot_2 = new FightingRobot();
        fightingRobot_2.shoot();
        fightingRobot_2.fight();
        fightingRobot_2.drive();
        fightingRobot_2.fly();
        fightingRobot_2.walk();
        fightingRobot_2.refuel(Energy.ELECTRIC, 30);

        FightingRobot fightingRobot_3 = new FightingRobot();
        fightingRobot_3.shoot();
        fightingRobot_3.fight();
        fightingRobot_3.drive();
        fightingRobot_3.fly();
        fightingRobot_3.walk();
        fightingRobot_3.refuel(Energy.INTERNAL_COMBUSTION, 10);


        //роботы - повара показывают все виды действий и заправку различными видами энергии
        ChefRobot chefRobot_1 = new ChefRobot();
        chefRobot_1.cook();
        chefRobot_1.drive();
        chefRobot_1.fly();
        chefRobot_1.walk();
        chefRobot_1.refuel(Energy.INTERNAL_COMBUSTION, 5);

        ChefRobot chefRobot_2 = new ChefRobot();
        chefRobot_2.cook();
        chefRobot_2.drive();
        chefRobot_2.fly();
        chefRobot_2.walk();
        chefRobot_2.refuel(Energy.ELECTRIC, 20);

        ChefRobot chefRobot_3 = new ChefRobot();
        chefRobot_3.cook();
        chefRobot_3.drive();
        chefRobot_3.fly();
        chefRobot_3.walk();
        chefRobot_3.refuel(Energy.ATOMIC, 50);

        //роботы - сварщики показывают все виды действий и заправку различными видами энергии
        WelderRobot welderRobot_1 = new WelderRobot();
        welderRobot_1.weld();
        welderRobot_1.walk();
        welderRobot_1.drive();
        welderRobot_1.fly();
        welderRobot_1.refuel(Energy.ATOMIC, 55);

        WelderRobot welderRobot_2 = new WelderRobot();
        welderRobot_2.weld();
        welderRobot_2.walk();
        welderRobot_2.drive();
        welderRobot_2.fly();
        welderRobot_2.refuel(Energy.ELECTRIC, 60);

        WelderRobot welderRobot_3 = new WelderRobot();
        welderRobot_3.weld();
        welderRobot_3.walk();
        welderRobot_3.drive();
        welderRobot_3.fly();
        welderRobot_3.refuel(Energy.INTERNAL_COMBUSTION, 100);


    }
}