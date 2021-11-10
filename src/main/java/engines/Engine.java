package engines;

public abstract class Engine {

    protected double fuelConsumption;

    protected double maximumSpeed;


    public Engine(double fuelConsumption, double maximumSpeed) {
        this.fuelConsumption = fuelConsumption;
        this.maximumSpeed = maximumSpeed;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(double maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    public abstract double drive(double distance);
}
