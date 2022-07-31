package qa.fuel;

public class ElectricFuel extends Fuel {
    private Float fuelVolume = 50.0F;
    private Float fuelRemain = 50.0F;
    private final Float percentToNeedToRefuel = 0.2F;

    public ElectricFuel(Float fuelVolume) {
        super(fuelVolume, "Ёлектричество");
        this.fuelVolume = fuelVolume;
        this.fuelRemain = fuelVolume;
    }


    @Override
    public boolean isEnoughEnergy(float needEnergy) {
        return fuelRemain - needEnergy >= 0;
    }

    @Override
    public boolean isNeededRefuel() {
        return fuelRemain <= fuelVolume * percentToNeedToRefuel;
    }

    @Override
    public boolean useEnergy(float needEnergy) {
        if (isEnoughEnergy(needEnergy)) {
            fuelRemain -= needEnergy;
            return true;
        }
        return false;
    }

    @Override
    public void refuel() {
        fuelRemain = fuelVolume;
    }
}
