package homework_31.river;

import classwork_30.soldier.Soldier;

//Создать класс River
//Сделать класс River сортируемым по полю длинна

import java.util.Objects;

public class River implements Comparable<River> {

    private String name;
    private int length;
    private double weight;
    private int depth;

    public River(String name, int length, double weight, int depth) {
        this.name = name;
        this.length = length;
        this.weight = weight;
        this.depth = depth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof River river)) return false;
        return length == river.length && Double.compare(weight, river.weight) == 0 && depth == river.depth && Objects.equals(name, river.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, length, weight, depth);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("River{");
        sb.append("name='").append(name).append('\'');
        sb.append(", length=").append(length);
        sb.append(", weight=").append(weight);
        sb.append(", depth=").append(depth);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(River river) {
        return Integer.compare(this.getLength(),river.getLength());
    }
}// end of class
