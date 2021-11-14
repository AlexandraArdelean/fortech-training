package course03;

import course03.exception.InvalidGearException;
import course03.exception.InvalidProductionYearException;

public class DaciaDuster extends Dacia{
    public DaciaDuster(Color color, int productionYear) throws InvalidProductionYearException {
        super(color, productionYear);
    }

    @Override
    public int getMaxSpeed() {
        return 0;
    }

    @Override
    public String getProducer() {
        return null;
    }

    @Override
    public String getModel() {
        return null;
    }

    @Override
    public int getProductionStartYear() {
        return 0;
    }

    @Override
    public int getProductionEndYear() {
        return 0;
    }

    @Override
    public int getNumberOfGears() {
        return 0;
    }

    @Override
    public int getMaxSpeedForGear(int gear) throws InvalidGearException {
        return 0;
    }
}
