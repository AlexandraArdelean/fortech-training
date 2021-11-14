package course03;

import course03.exception.*;

import java.sql.SQLOutput;

public abstract class Vehicle implements VehicleInterface {
    private int currentGear;
    private int currentSpeed;
    private int productionYear;
    private Color color;

    private Vehicle() {
        this(-1, 1);
    }

    private Vehicle(int currentGear, int currentSpeed) {
        this.currentGear = currentGear;
        this.currentSpeed = currentSpeed;

    }

    public Vehicle(Color color, int productionYear) throws InvalidProductionYearException {
        this();
        try {
            this.color = color;
            setProductionYear(productionYear);
        } catch (VehicleException ve) {
            throw new VehicleRunTimeException("Couldn't create a vehicle", ve);
        }
    }

    private void setProductionYear(int productionYear) throws InvalidProductionYearException {
        int productionEndYear = getProductionEndYear();
        int productionStartYear = getProductionStartYear();

        if (productionStartYear > productionYear || productionEndYear < productionYear) {
            throw new InvalidProductionYearException(
                    "The production year must be between"
                            + productionStartYear + " and "
                            + productionEndYear);
        } else {
            this.productionYear = productionYear;
        }


    }
    public void startEngine() throws EngineNotStopedException{
    if (currentGear !=-1 || currentSpeed !=-1){
        throw  new EngineNotStopedException("Engine is stopped");

    }else {
        currentSpeed=0;
        currentGear=0;
        System.out.println("Engine has started");
    }
    }

    public void stopEngine() throws EngineNotStartedException{
        if (currentGear==-1 || currentSpeed==-1){
            throw new EngineNotStartedException("Engine is already stopped");
        }else {
            currentSpeed=-1;
            currentGear=-1;
            System.out.println("Engine has stopped");

        }
    }
    public void accelerate(int acceleration) throws EngineNotStartedException, InvalidSpeedException, InvalidGearException{
        if (currentGear==-1){
            throw new EngineNotStartedException("Engine is stopped");

        }else if (currentGear==0){
            throw new InvalidGearException("Is not in gear");

        }else {
            currentSpeed=currentGear + acceleration;
        }
    }

    public void changeGear(int newGear) throws InvalidGearException{
        if (newGear < currentGear && getMaxSpeedForGear(newGear)>getMaxSpeedForGear(currentGear)){
            throw new InvalidGearException("Reduce speed");
        }if (newGear>getNumberOfGears()){
            throw new InvalidGearException("Out of gears");

        }if (newGear==currentGear){
            throw new InvalidGearException("Same gear");

        }else {
            currentGear=newGear;
        }
    }

}
