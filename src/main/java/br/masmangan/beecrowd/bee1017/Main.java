package br.masmangan.beecrowd.bee1017;

class Main {

    public static int performance = 12;
    
    public static float howManyLiters(int time, int avgVelocity) {
        int distance = time * avgVelocity;
        float liters = (float) distance / (float) performance;
        return liters;
    }

    public static void main(String [] args) {
        float liters1 = howManyLiters(10, 85);
        System.out.printf("%.3f\n", liters1);
        
        float liters2 = howManyLiters(2, 92);
        System.out.printf("%.3f\n", liters2);
        
        float liters3 = howManyLiters(22, 67);
        System.out.printf("%.3f\n", liters3);
    }
    
}