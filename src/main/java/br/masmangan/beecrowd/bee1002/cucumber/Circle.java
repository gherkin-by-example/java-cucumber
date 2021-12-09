package br.masmangan.beecrowd.uri1002.cucumber;

public class Circle {
    public static final double PI = 3.14159;
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }
}
