package course03;

import course03.exception.InvalidGearException;

public interface VehicleInterface  {

    int getNumberOfWheels();

    int getMaxSpeed();

    String getProducer();

    String getModel();

    int getProductionStartYear();

    int getProductionEndYear();

    int getNumberOfGears();

    int getMaxSpeedForGear(int gear) throws InvalidGearException;
}
