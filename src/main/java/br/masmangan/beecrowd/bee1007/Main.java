package br.masmangan.beecrowd.bee1007;

import java.util.Scanner;

import static java.lang.System.out;

public class Main {

    private Main() {

    }

    public static void main(String[] args) {
        Product product;
        Scanner in;

        product = new Product();
        in = new Scanner(System.in);

        product.setA(in.nextInt());
        product.setB(in.nextInt());
        product.setC(in.nextInt());
        product.setD(in.nextInt());

        in.close();

        out.printf("DIFERENCA = %d%n", product.getDifference());
    }
}