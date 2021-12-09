package br.masmangan.beecrowd.bee1002.cucumber;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public final class Main {
    private Main() {

    }

    public static void main(String[] args) {
        Scanner s;
        s = new Scanner(in);
        double r = s.nextDouble();
        s.close();

        out.printf("A=%.4f%n", 3.14159 * r * r);

    }

}
