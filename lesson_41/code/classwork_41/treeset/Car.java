package classwork_41.treeset;

import java.util.Objects;

public class Car implements Comparable<Car>{

    private String regNumber;
    private String model;
    private String company;
    private double engine;
    private String color;

    public Car(String regNumber, String model, String company, double engine, String color) {
        this.regNumber = regNumber;
        this.model = model;
        this.company = company;
        this.engine = engine;
        this.color = color;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Car car)) return false;
//        return Objects.equals(regNumber, car.regNumber);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hashCode(regNumber);
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return Objects.equals(regNumber, car.regNumber) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regNumber, color);
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("regNumber='").append(regNumber).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", company='").append(company).append('\'');
        sb.append(", engine=").append(engine);
        sb.append(", color='").append(color).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Car o) {
        int res = this.getRegNumber().compareTo(o.getRegNumber());
        return res != 0 ? res : this.color.compareTo(o.color);
    }
}
