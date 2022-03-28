package br.masmangan.beecrowd.bee1014;

public class FuelConsumption {
    private double fuel;
    private double distance;

    public void setFuel(double fuel){
        this.fuel = fuel;
    }

    public void setDistance(double distance){
        this.distance = distance;
    }

    public double getConsumption() {
        return this.distance/this.fuel;
    }
}
