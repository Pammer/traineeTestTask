package qa;

public interface FuelEnergy {

    default void fillFuel(int amountFuel) {  //инкапсуляция
        if (amountFuel>0) {
            System.out.println("I'm ok");
        }

        System.out.println("Need refill Fuel");
    }
    default int refillFuel(int amountFuel) { //инкапсуляция
        if (amountFuel==0) {
            return 200;
        }

        return 0;
    }
}

