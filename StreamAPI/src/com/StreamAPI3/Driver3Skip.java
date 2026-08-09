package com.StreamAPI3;

import java.util.Arrays;
import java.util.List;

public class Driver3Skip {
	
	public static void main(String[] args) {
		List<Integer> input = Arrays.asList(10, 4, 5, 6, 6, 7, 8);
		// skip
		input.stream().skip(2).forEach(n -> System.out.println(n));
	}
	
}
