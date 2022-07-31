package qa.Robots;

import qa.fuel.Fuel;

import static java.lang.Math.abs;

public abstract class Robot {
    private Float x;
    private Float y;
    private Float z;
    private final Fuel fuel;
    private String specialDoing = "";

    public Robot (Fuel fuel) {
        this.fuel = fuel;
        this.x = 0F;
        this.y = 0F;
        this.z = 0F;
    }

    public Robot (Float x, Float y, Float z,Fuel fuel) {
        this.fuel = fuel;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void isNeedToRefuel() {
        if (fuel.isNeededRefuel()) {
            System.out.println("Заправь, пж!");
        } else System.out.println("Топлива хватает.");
    }

    boolean doing(float needEnergy){
        if (!specialDoing.equals("")) {
            System.out.println("Сначала выключи " + specialDoing);
        } else if (needEnergy == 0) {
            System.out.println("Мда, остались там же!");
        } else if(fuel.useEnergy(needEnergy)) {
            System.out.println("Успешно!");
            return true;
        } else {
            System.out.println("Не хватает энергии. Требуется дозаправка, либо не возможно сделать это действие за раз - у робота не бесконечный бак");
        }
        return false;
    }

    // бег затрачивает в 2 раза больше энергии чем ходьба
    public void go(Float x, Float y){
        if (this.z > 0) {
            System.out.println("Сначала нужно приземлиться!");
        } else {
            float needEnergy = (abs(this.x - x) + abs(this.y - y)) * 2;
            if (doing(needEnergy)) {
                this.x = x;
                this.y = y;
            }
        }
    }

    public void goRight() {
        go(this.x + 10, this.y);
    }

    public void goLeft() {
        go(this.x - 10, this.y);
    }

    public void goForward() {
        go(this.x, this.y + 10);
    }

    public void goBack() {
        go(this.x, this.y - 10);
    }

    public void walk(Float x, Float y) {
        if (this.z > 0) {
            System.out.println("Сначала нужно приземлиться!");
        } else {
            float needEnergy = (abs(this.x - x) + abs(this.y - y));
            if (doing(needEnergy)) {
                this.x = x;
                this.y = y;
            }
        }
    }

    public void walkRight() {
        walk(this.x + 10, this.y);
    }

    public void walkLeft() {
        walk(this.x - 10, this.y);
    }

    public void walkForward() {
        walk(this.x, this.y + 10);
    }

    public void walkBack() {
        walk(this.x, this.y - 10);
    }

    public void fly(Float x, Float y,Float z){
        if (z < 0) {
            z = 0.0F;
            System.out.println("Разбиваться не будем, попробуем просто приземлиться...");
        }
        float needEnergy = abs(this.x -x) + abs(this.y - y) + abs(this.z - z);
        if (doing(needEnergy)) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }

    public void flyRight() {
        fly(this.x + 10, this.y, this.z);
    }

    public void flyLeft() {
        fly(this.x - 10, this.y, this.z);
    }

    public void flyForward() {
        fly(this.x, this.y + 10, this.z);
    }

    public void flyBack() {
        fly(this.x, this.y - 10, this.z);
    }

    public void flyUp() {
        fly(this.x, this.y, this.z + 10);
    }

    public void flyDown() {
        fly(this.x, this.y, this.z - 10);
    }


    public void refuel(String type) {
        if (!type.equals(fuel.getType())) {
            System.out.println("Ты хочешь заправить робота чем-то странным...");
        } else {
            if (fuel.isNeededRefuel()) {
                fuel.refuel();
                System.out.println("Заправка прошла успешно!");
            } else System.out.println("Топлива хватает.");
        }
    }

    public void stopSpecialDoing() {
        this.specialDoing = "";
    }

    public void setSpecialDoing(String specialDoing) {
        this.specialDoing = specialDoing;
    }

    public String getSpecialDoing() {
        return specialDoing;
    }
}
