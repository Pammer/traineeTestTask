package qa;

public interface ElectricEnergy {

    default void fillElectricity(int amountElectricity) {  //инкапсуляция
        if (amountElectricity > 20) {
            System.out.println("I'm ok");
        }

        System.out.println("Need refill Electricity");
    }

    default int refillElectricity(int amountElectricity) {  //инкапсуляция
        if (amountElectricity < 20) {
            return 100;
        }

        return 0;
    }
}
