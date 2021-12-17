package br.masmangan.beecrowd.bee1006;

public class StudentGrade {
    private double a;
    private double b;
    private double c;

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) { this.c = c; }

    public double getAverage() {
        return (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;
    }
}
