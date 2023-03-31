package com.java11.practice;

import java.util.stream.Stream;

public class Feature3 {
	
	public static void main(String a[]) {

	System.out.println(":-) ".repeat(10));//concept 1
	
	Stream<String> lines = "foonbarnbaz".lines();//lines created with specific character
	lines.forEachOrdered(System.out::println);// it is printted in an order
	
	// code cnippet showing or missing the repeat() or the lines ()
}
}
