package qa.Interfaces;

public interface FuelHandling {
    boolean isEnoughEnergy(float needEnergy);
    boolean isNeededRefuel();
    boolean useEnergy(float needEnergy);
    void refuel();
}
