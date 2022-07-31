package qa.Robots;

import qa.Interfaces.WarriorInterface;
import qa.fuel.Fuel;

public class WarriorRobot extends Robot implements WarriorInterface {
    private final Float needEnergy = 10.0F;

    public WarriorRobot(Float x, Float y, Float z, Fuel fuel) {
        super(x, y, z, fuel);
    }

    public WarriorRobot(Fuel fuel) {
        super(fuel);
    }

    @Override
    public void attack() {
        if (doing(needEnergy)) {
            System.out.println("�������� � �����!");
            setSpecialDoing("�����");
        }
    }

    @Override
    public void defend() {
        if (doing(needEnergy)) {
            System.out.println("�������� � ������!");
            setSpecialDoing("������");
        }
    }

}
