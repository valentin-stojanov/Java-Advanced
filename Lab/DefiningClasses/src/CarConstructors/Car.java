package CarConstructors;

public class Car {
    private String brand;
    private String model;
    private int horsePower;

    public Car(String brand, String model, int horsePower){
        this.setBrand(brand);
        this.setModel(model);
        this.setHorsePower(horsePower);
    }

    public Car(String brand, String model){
        this(brand, model, -1);
    }

    public Car(String brand, int horsePower){
        this(brand, "unknown", horsePower);
    }

    public Car(int horsePower, String model){
        this("unknown", model, horsePower);
    }

    public Car(String brand){
        this(brand, "unknown", -1 );
    }

    @Override
    public String toString() {
        return String.format("The car is: %s %s - %d HP.", this.getBrand(), this.getModel(), this.getHorsePower());
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public int getHorsePower() {
        return this.horsePower;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
