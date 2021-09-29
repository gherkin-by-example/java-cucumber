package br.masmangan.uri.uri1001.cucumber;

import java.io.IOException;
import java.util.*;
import static java.lang.System.out;
import static java.lang.System.in;

public class Main {

	public static void main(String[] args) throws IOException {

		Calculator c;
		Scanner s;

		c = new Calculator();
		s = new Scanner(in);
		
		c.setA(s.nextInt());
		c.setB(s.nextInt());
		
		s.close();

		out.printf("X = %d\n", c.getSum());

	}

}
