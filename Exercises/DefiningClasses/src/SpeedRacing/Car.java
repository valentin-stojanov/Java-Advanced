package SpeedRacing;

public class Car {
    private String model;
    private double fuelAmount;
    private double fuelCostFor1km;
    private int traveledDistance;

    public Car(String model, double fuelAmount, double fuelCostFor1km) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCostFor1km = fuelCostFor1km;
        this.traveledDistance = 0;
    }

    public boolean canTravel(int kilometers) {
        double neededFuel = kilometers * this.fuelCostFor1km;
        if (neededFuel <= this.fuelAmount) {
            this.fuelAmount -= neededFuel;
            this.traveledDistance += kilometers;
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        return String.format("%s %.2f %d", this.model, this.fuelAmount, this.traveledDistance);
    }
}
