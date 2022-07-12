package qa;

public class ChiefBot extends Robot implements AtomicEnergy, FuelEnergy, ElectricEnergy { //наследование
    public Boolean haveCookAbility() {
        return true;
    }

}
