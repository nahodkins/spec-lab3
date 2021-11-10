package engines;

public class ElectricEngine extends Engine{

    public ElectricEngine(double fuelConsumption, double maximumSpeed) {
        super(fuelConsumption, maximumSpeed);
    }

    @Override
    public double drive(double distance) {
        System.out.println("Green energy! No emissions :)");
        return distance * fuelConsumption;
    }
}
