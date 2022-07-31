package qa.fuel;

import java.time.LocalTime;

public class AtomFuel extends Fuel{
    private LocalTime timeDie;

    public AtomFuel() {
        super(0F, "Атомная энергия");
        //438000 часов в 50 годах
        timeDie = LocalTime.now().plusHours(438000);
    }

    @Override
    public boolean isEnoughEnergy(float needEnergy) {
        return LocalTime.now().isBefore(timeDie);
    }

    @Override
    public boolean isNeededRefuel() {
        return LocalTime.now().isAfter(timeDie);
    }

    @Override
    public boolean useEnergy(float needEnergy) {
        return isEnoughEnergy(0);
    }

    @Override
    public void refuel() {
        timeDie = LocalTime.now().plusHours(438000);
    }
}
