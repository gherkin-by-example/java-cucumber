package br.masmangan.beecrowd.bee1017;

import java.util.Scanner;

import static java.lang.System.out;


class Main {
    
    public static float howManyLiters(int time, int avgVelocity) {
        int distance = time * avgVelocity;
        float liters = (float) distance / 12.0;
        return liters;
    }

    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);

        int time = in.nextInt();
        int avgVelocity = in.nextInt();
        
        in.close();
        
        float liters = howManyLiters(time, avgVelocity);
        
        System.out.printf("%.3f\n", liters1);
    }
}