package vehicle;

public abstract class Vehicle {
    public final int drivingCost = 500;
    public final int carCost = 300;
    public final int trainCost = 400;
    public final int planeCost = 1000;

    public abstract void reachDestination(int budge);
}
