package CarInfo;

public class Car {
    private String brand;
    private String model;
    private int horsepower;

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return model;
    }

    public int getHorsepower() {
        return this.horsepower;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }
    public String carInfo(){
        return toString();
    }

    @Override
    public String toString(){
        return String.format("The car is: %s %s - %d HP.", this.brand, this.model, this.horsepower);
    }
}
