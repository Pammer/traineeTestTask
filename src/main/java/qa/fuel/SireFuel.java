package qa.fuel;

public class SireFuel extends Fuel{
    private Float fuelVolume = 50.0F;
    private Float fuelRemain = 50.0F;

    public SireFuel(Float fuelVolume) {
        super(fuelVolume, "Дизель");
        this.fuelVolume = fuelVolume;
        this.fuelRemain = fuelVolume;
    }


    @Override
    public boolean isEnoughEnergy(float needEnergy) {
        return fuelRemain - needEnergy >= 0;
    }

    @Override
    public boolean isNeededRefuel() {
        return !fuelRemain.equals(fuelVolume);
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
