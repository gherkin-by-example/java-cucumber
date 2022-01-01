package br.masmangan.beecrowd.bee1007;

public class Product {
    private int a;
    private int b;
    private int c;
    private int d;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) { this.c = c; }

    public void setD(int d) {
        this.d = d;
    }

    public int getDifference() {
        return a * b - c * d;
    }
}
