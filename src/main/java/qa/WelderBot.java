package qa;

public class WelderBot extends Robot implements AtomicEnergy, FuelEnergy, ElectricEnergy { //наследование
    public Boolean haveWelderAbility() {
        return true;
    }

}
