package br.masmangan.beecrowd.bee1060;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Main {
    private Main() {
		
	}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        ArrayList<Double> inputedNumbers = new ArrayList<Double>();

        inputedNumbers.add(scanner.nextDouble());
        inputedNumbers.add(scanner.nextDouble());
        inputedNumbers.add(scanner.nextDouble());
        inputedNumbers.add(scanner.nextDouble());
        inputedNumbers.add(scanner.nextDouble());
        inputedNumbers.add(scanner.nextDouble());

        scanner.close();

        int count = 0;
        for (int i=0; i<inputedNumbers.size(); i++) {
            if (inputedNumbers.get(i) > 0) {
                count++;
            }
        }

        out.printf("%d valores positivos%n", count);
    }    
}
