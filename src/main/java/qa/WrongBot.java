package qa;

public class WrongBot extends ChiefBot implements AtomicEnergy, FuelEnergy, ElectricEnergy { //наследование
    @Override // полиморфизм
    public Boolean haveCookAbility() {
        return false;
    }

    public Boolean haveWelderAbility() {
        return true;
    }
    public void fillFuelWrong(int amountFuel) {
        if (amountFuel>0) {
            System.out.println("I'm ok");
        }

        System.out.println("Need refill Fuel");
    }
    public String refillFuelWrong(int amountFuel) {
        if (amountFuel==0) {
            return "200 kg coal";
        }

        return "now enough";
    }
}
