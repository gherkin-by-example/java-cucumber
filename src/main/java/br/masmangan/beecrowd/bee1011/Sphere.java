package br.masmangan.beecrowd.bee1011;

import java.text.DecimalFormat;

public class Sphere {

    static double pi = 3.14159;

    private double radius;
    private double volume;
    private static final DecimalFormat df = new DecimalFormat("0.000");

    public Sphere() {
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculate() {

        double result = (4/3.0)*pi*Math.pow(radius, 3);
        this.volume = result;
        return Double.parseDouble(df.format(result));
    }
}
