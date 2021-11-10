package transport;

import engines.Engine;

public abstract class Transport {

    private static final String DRIVING_MSG_TEMPLATE = "%s is driving...%n";
    protected String name;

    protected double tankVolume;

    protected Engine engine;

    public Transport(String name, double tankVolume, Engine engine) {
        this.name = name;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTankVolume() {
        return tankVolume;
    }

    public void setTankVolume(double tankVolume) {
        this.tankVolume = tankVolume;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void drive(double distance) {
        System.out.printf(DRIVING_MSG_TEMPLATE, name);
    }
}
