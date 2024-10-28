package classwork_18.computer_shop.model;

public class Smartphone extends Laptop {

    private long imea;

    public Smartphone(String cpu, int ram, int ssd, String brand, double price, double displaySize, double weight, int battery, String color, long imea) {
        super(cpu, ram, ssd, brand, price, displaySize, weight, battery, color);
        this.imea = imea;
    }


}
