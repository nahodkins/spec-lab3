package transport;

import engines.Engine;
import engines.GasEngine;

public class Truck extends Transport{

    private static final String LIFT_AND_WASTED_MSG_TEMPLATE =
            "Wasted %.3fl of the fuel. Transported %.3ft of the cargo.%n";

    protected double liftingCapacity;

    public Truck(String name, double tankVolume, double liftingCapacity) {
        super(name, tankVolume, new GasEngine(22.0, 72.0, 5.0));
        this.liftingCapacity = liftingCapacity;
    }

    @Override
    public void drive(double distance) {
        super.drive(distance);
        double wasted = engine.drive(distance);
        System.out.printf(LIFT_AND_WASTED_MSG_TEMPLATE, wasted, liftingCapacity);
    }
}
