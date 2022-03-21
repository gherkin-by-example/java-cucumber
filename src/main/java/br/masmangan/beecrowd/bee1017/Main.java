package br.masmangan.beecrowd.bee1017;

import java.util.Scanner;

import static java.lang.System.out;

public class Main {

    private Main() {

    }

    public static void main(String[] args) {
        FuelCalculator division;
        Scanner in;

        division = new FuelCalculator();
        in = new Scanner(System.in);

        division.setA(in.nextInt());
        division.setB(in.nextInt());

        in.close();

        out.printf("FUEL = %.3f%n", division.calculateFuelNeeded());
    }
}