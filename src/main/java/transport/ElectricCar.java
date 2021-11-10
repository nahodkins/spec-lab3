package transport;

import engines.ElectricEngine;
import engines.Engine;
import engines.GasEngine;

public class ElectricCar extends Transport{

    private static final String DRIVE_MSG_TEMPLATE = "Wasted %.3f percents of the charge%n";

    public ElectricCar(String name, double electricConsumption, double maxSpeed) {
        super(name, 100, new ElectricEngine(electricConsumption,maxSpeed));
    }

    @Override
    public void drive(double distance) {
        super.drive(distance);
        double wasted = engine.drive(distance);
        System.out.printf(DRIVE_MSG_TEMPLATE, wasted);
    }
}
