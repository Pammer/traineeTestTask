package qa.Robots;

import qa.Interfaces.CookerInterface;
import qa.fuel.Fuel;

public class CookerRobot extends Robot implements CookerInterface {
    private final Float needEnergy = 8.0F;

    public CookerRobot(Float x, Float y, Float z, Fuel fuel) {
        super(x, y, z, fuel);
    }

    public CookerRobot(Fuel fuel) {
        super(fuel);
    }

    @Override
    public void cook() {
        if (doing(needEnergy)) {
            System.out.println("Начинаем готовить!");
            setSpecialDoing("Готовка");
        }
    }
}