package br.masmangan.beecrowd.bee1074;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

    	Scanner key = new Scanner(System.in);
    	int N = key.nextInt();

    	for (int i = 0; i < N; i++) {
    		int x = key.nextInt();

    		if (x == 0) System.out.println("NULL");

    		    else if (x % 2 == 0 && x > 0) System.out.println("EVEN POSITIVE");

    		        else if (x % 2 == 0 && x < 0) System.out.println("EVEN NEGATIVE");

    		            else if (x % 2 != 0 && x > 0) System.out.println("ODD POSITIVE");

    		                else if (x % 2 != 0 && x < 0) System.out.println("ODD NEGATIVE");
    	}
	}
	
}