package course03;

import course03.exception.InvalidProductionYearException;

public abstract class Dacia extends Car{
    public Dacia(Color color, int productionYear) throws InvalidProductionYearException {
        super(color, productionYear);
    }

    @Override
    public String getProducer() {
        return null;
    }
}
