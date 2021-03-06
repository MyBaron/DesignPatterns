package desion.pattern.abstractfactory;

public class BWMFactory implements IFactory {

    @Override
    public Car createBTCar() {
        return new BWMBTCar();
    }

    @Override
    public Car createGWCar() {
        return new BWMGWCar();
    }
}
