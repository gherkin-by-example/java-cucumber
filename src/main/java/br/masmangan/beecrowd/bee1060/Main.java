package br.masmangan.beecrowd.bee1060;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Main {
    public static ArrayList<Integer> numbers = new ArrayList<Integer>();

    private Main() {
		
	}

    public static void main(String[] args) {
        numbers = readNumbers();
        hasPositiveNumbers(numbers);
    }

    private static ArrayList<Integer> readNumbers () {
        Scanner scanner = new Scanner(in);

        ArrayList<Integer> inputedNumbers = new ArrayList<Integer>();

        out.println(" ---- Type six numbers to start the program, write one a one, typing the number and pressing enter. ");
        
        inputedNumbers.add(scanner.nextInt());
        inputedNumbers.add(scanner.nextInt());
        inputedNumbers.add(scanner.nextInt());
        inputedNumbers.add(scanner.nextInt());
        inputedNumbers.add(scanner.nextInt());
        inputedNumbers.add(scanner.nextInt());

        scanner.close();

        return inputedNumbers;
    }

    private static void hasPositiveNumbers (ArrayList<Integer> numbers) {
        int count = 0;

        for (int i=0; i<numbers.size(); i++) {
            if (numbers.get(i) >= 0) {
                count++;
            }
        }

        out.printf("The list have %d positive numbers.%n", count);
    }
    
}
