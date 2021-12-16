package br.masmangan.beecrowd.bee1005;


import java.util.Scanner;

public class Main {

    private Main() {

    }

    public static void main(String[] args) {
        Equation equation;
        Scanner in;

        equation = new Equation();
        in = new Scanner(System.in);

        equation.setA(in.nextDouble());
        equation.setB(in.nextDouble());

        in.close();

        System.out.printf("MEDIA = %.5f%n", equation.getAverage());
    }
}