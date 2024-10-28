package homework_30.bestCityForHoliday;

//---Задание 1----
// Придумайте класс МойКласс с полями типа:
//      -String
//      -int
//      -double например: Person - name, weight, age City - name, population, area ...или выберите тот, с которым вы делали проекты по Марафону.

// Выполните с набором объектов этого класса все то, что мы делали на занятии:
//      -сортировка по умолчанию
//      -сортировка по 2-м критериям
//      -поиск в массиве с помощью Arrays.binarySearch()

import java.util.Objects;

public class City implements Comparable<City> {

    private String name;
    private int population;
    private int price;
    private double rate;

    public City(String name, int population, int price, double rate) {
        this.name = name;
        this.population = population;
        this.price = price;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City city)) return false;
        return population == city.population && price == city.price && Double.compare(rate, city.rate) == 0 && Objects.equals(name, city.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, population, price, rate);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("City{");
        sb.append("name='").append(name).append('\'');
        sb.append(", population=").append(population);
        sb.append(", price=").append(price);
        sb.append(", rate=").append(rate);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(City cities) {
        return Integer.compare(cities.getPopulation(),this.getPopulation()); // сортировка по населению от болшего к меншему 
    }
}// end of class

