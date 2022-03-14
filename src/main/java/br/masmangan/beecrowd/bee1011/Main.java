package br.masmangan.beecrowd.bee1011;


import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.System.out;

class Main {

    static double pi = 3.14159;
    private static final DecimalFormat df = new DecimalFormat("0.000");

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double value = scanner.nextDouble();

        double result = (4/3.0)*pi*Math.pow(value, 3);

        out.println("VOLUME = " + df.format(result));

    }

}