package com.StreamAPI1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver {

	public static void main(String[] args) {
		List<Integer> input = Arrays.asList(10, 4, 15, 4, 5, 6, 6, 7, 8);
		// remove the duplicate
//		List<Integer> output = input.stream().distinct().collect(Collectors.toList());
//		System.out.println(output);
		
		// sorting
//		output.stream().sorted((a,b) -> a-b).forEach(number -> System.out.print(number +", "));
//		System.out.println();
//		output.stream().sorted((a,b) -> b-a).forEach(number -> System.out.print(number +", "));
//		System.out.println();
		
		input.stream().skip(2).forEach(n -> System.out.println(n));
		
	}

}
