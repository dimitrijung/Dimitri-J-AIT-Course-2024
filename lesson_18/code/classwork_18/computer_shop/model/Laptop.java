package classwork_18.computer_shop.model;

public class Laptop extends Computer {

    private double displaySize;
    private double weight;
    private int battery;
    private String color;

    public Laptop(String cpu, int ram, int ssd, String brand, double price, double displaySize, double weight, int battery, String color) {
        super(cpu, ram, ssd, brand, price);
        this.displaySize = displaySize;
        this.weight = weight;
        this.battery = battery;
        this.color = color;
    }

    public double getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "displaySize=" + displaySize +
                ", weight=" + weight +
                ", battery=" + battery +
                ", color='" + color + '\'' +
                "} " + super.toString();
    }
} // end of class
