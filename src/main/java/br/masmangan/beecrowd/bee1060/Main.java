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
        ArrayList<Integer> inputedNumbers = new ArrayList<Integer>();

        out.printf("Type six numbers to start the program, write one a one, typing the number and pressing enter.%n");
        
        inputedNumbers.add(scanner.nextInt());
        inputedNumbers.add(scanner.nextInt());
        inputedNumbers.add(scanner.nextInt());
        inputedNumbers.add(scanner.nextInt());
        inputedNumbers.add(scanner.nextInt());
        inputedNumbers.add(scanner.nextInt());

        scanner.close();

        int count = 0;
        for (int i=0; i<inputedNumbers.size(); i++) {
            if (inputedNumbers.get(i) >= 0) {
                count++;
            }
        }

        out.printf("The list have %d positive numbers.%n", count);
    }    
}
