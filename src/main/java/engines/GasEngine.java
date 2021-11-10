package engines;

public class GasEngine extends Engine{

    private static final String EMISSIONS_MSG_TEMPLATE = "CO2 emissions: %.3fg%n";
    private double emissionsQuantity;

    public GasEngine(double fuelConsumption, double maximumSpeed, double emissionsQuantity) {
        super(fuelConsumption, maximumSpeed);
        this.emissionsQuantity = emissionsQuantity;
    }

    @Override
    public double drive(double distance) {
        System.out.printf((EMISSIONS_MSG_TEMPLATE), emissionsQuantity * distance);
        return fuelConsumption * distance;
    }
}
