package qa;

public class WarBot extends Robot implements AtomicEnergy, FuelEnergy, ElectricEnergy { //наследование
    public Boolean haveWeapons() {
        return true;
    }

    public Boolean haveShootAbility() {
        return true;
    }

}
