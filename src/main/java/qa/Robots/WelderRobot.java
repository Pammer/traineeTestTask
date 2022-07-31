package qa.Robots;

import qa.Interfaces.WelderInterface;
import qa.fuel.Fuel;

public class WelderRobot extends Robot implements WelderInterface {
    private final Float needEnergy = 13.0F;

    public WelderRobot(Float x, Float y, Float z, Fuel fuel) {
        super(x, y, z, fuel);
    }

    public WelderRobot(Fuel fuel) {
        super(fuel);
    }

    @Override
    public void welder() {
        if (doing(needEnergy)) {
            System.out.println("Я сварщик, работаем без перекура!");
            setSpecialDoing("Сварщик");
        }
    }
}
