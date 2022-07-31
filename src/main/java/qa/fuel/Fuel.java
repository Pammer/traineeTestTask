package qa.fuel;

public abstract class Fuel {
    private Float fuelVolume;
    private Float fuelRemain;
    private String type;

    public Fuel(Float fuelVolume, String type) {
        this.fuelVolume = fuelVolume;
        this.fuelRemain = fuelVolume;
        this.type = type;
    }

    public Fuel() {
        fuelVolume = 50.0F;
        fuelRemain = 50.0F;
    }

    public abstract boolean isEnoughEnergy(float needEnergy);

    public abstract boolean isNeededRefuel();

    public abstract boolean useEnergy(float needEnergy);

    public abstract void refuel();

    public String getType() {
        return type;
    }
}
