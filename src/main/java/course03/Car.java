package course03;

import course03.exception.InvalidProductionYearException;

public abstract class Car extends Vehicle{

    public Car(Color color, int productionYear) throws InvalidProductionYearException {
        super(color, productionYear);
    }

    @Override
    public int getNumberOfWheels() {
        return 0;
    }
}
