package br.masmangan.beecrowd.bee1011;

public class Sphere {

    static double pi = 3.14159;

    private double radius;
    private double volume;

    public Sphere() {
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculate() {

        double result = (4/3.0)*pi*Math.pow(radius, 3);
        this.volume = result;
        return result;
    }
}
