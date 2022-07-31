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
            System.out.println("�������, ��!");
        } else System.out.println("������� �������.");
    }

    boolean doing(float needEnergy){
        if (!specialDoing.equals("")) {
            System.out.println("������� ������� " + specialDoing);
        } else if (needEnergy == 0) {
            System.out.println("���, �������� ��� ��!");
        } else if(fuel.useEnergy(needEnergy)) {
            System.out.println("�������!");
            return true;
        } else {
            System.out.println("�� ������� �������. ��������� ����������, ���� �� �������� ������� ��� �������� �� ��� - � ������ �� ����������� ���");
        }
        return false;
    }

    // ��� ����������� � 2 ���� ������ ������� ��� ������
    public void go(Float x, Float y){
        if (this.z > 0) {
            System.out.println("������� ����� ������������!");
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
            System.out.println("������� ����� ������������!");
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
            System.out.println("����������� �� �����, ��������� ������ ������������...");
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
            System.out.println("�� ������ ��������� ������ ���-�� ��������...");
        } else {
            if (fuel.isNeededRefuel()) {
                fuel.refuel();
                System.out.println("�������� ������ �������!");
            } else System.out.println("������� �������.");
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
