package br.masmangan.uri.uri1001.cucumber;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.Charset;

import org.junit.Test;

public class MainTest {

	@Test
	public void test() throws IOException {
		String input = "10\n9";
		String expected = "X = 19\n";
		String actual;

		InputStream inputStream = new ByteArrayInputStream(input.getBytes(Charset.forName("UTF-8")));
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream outputStream = new PrintStream(baos);

		PrintStream previousOut = System.out;
		InputStream previousIn = System.in;
		
		System.setIn(inputStream);
		System.setOut(outputStream);
		
		Main.main(null);
		
		actual =  baos.toString();
		
		
		assertEquals(expected, actual);
		
		inputStream.close();
		outputStream.close();
		
	    System.setOut(previousOut);
	    System.setIn(previousIn);

	}

}
