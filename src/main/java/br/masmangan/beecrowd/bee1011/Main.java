package br.masmangan.beecrowd.bee1011;


import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.System.out;

class Main {

    private static final DecimalFormat df = new DecimalFormat("0.000");

    private Main() {

    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double value = scanner.nextDouble();

        Sphere sphere = new Sphere();
        sphere.setRadius(value);

        double result = sphere.calculate();

        out.println("VOLUME = " + df.format(result));

    }

}