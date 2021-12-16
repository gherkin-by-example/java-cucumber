package br.masmangan.beecrowd.bee1005;

public class StudentGrade {
    private double a;
    private double b;

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getAverage() {
        return (a * 3.5 + b * 7.5) / 11.0;
    }
}
