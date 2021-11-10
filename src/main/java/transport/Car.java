package transport;

import engines.GasEngine;

public class Car extends Transport{

    private static final String CAR_NAME_TEMPLATE = "transport.Car: %s";

    private static final String WASTED_FUEL_MSG_TEMPLATE = "Wasted %.3fl of the fuel%n";

    private double maximumSpeed;

    public Car(String name, double tankVolume, double fuelConsumption, double maximumSpeed, double emissionsQuantity) {
        super(name, tankVolume, new GasEngine(fuelConsumption, maximumSpeed, emissionsQuantity));
    }

    @Override
    public void drive(double distance) {
        super.drive(distance);
        double wasted = engine.drive(distance);
        System.out.printf(WASTED_FUEL_MSG_TEMPLATE, wasted);
    }
}
