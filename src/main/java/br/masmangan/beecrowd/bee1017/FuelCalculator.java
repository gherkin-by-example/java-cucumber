package br.masmangan.beecrowd.bee1017;

public class FuelCalculator {
    private int a;
    private int b;
    private double consumption = 12.0;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public double getConsumption(){ return consumption; }

    public double calculateFuelNeeded() {
        double c = a;
        double d = b;

        return (c * d) / consumption;
    }
}
