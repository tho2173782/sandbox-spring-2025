package org.example.sandbox.comparable;

public class Apple extends Fruit implements Comparable<Fruit> {
    private String variety;

    public Apple(String name, String color, double weight, String variety) {
        super(name, color, weight);
        this.variety = variety;
    }

    public String getVariety() {
        return variety;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Apple{");
        sb.append("name='").append(getName()).append('\'');
        sb.append(", color='").append(getColor()).append('\'');
        sb.append(", weight=").append(getWeight());
        sb.append(", variety='").append(variety).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {
        Apple apple = new Apple("Apple", "Red", 150.0, "Gala");
        System.out.println(apple);
    }
}