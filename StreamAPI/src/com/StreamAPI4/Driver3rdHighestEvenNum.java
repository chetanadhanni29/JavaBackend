package com.StreamAPI4;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Driver3rdHighestEvenNum {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(4, 4, 5, 6, 6, 7, 8, 9, 5, 4, 3, 21, 2, 3445, 56, 7, 8);
		Optional<Integer> optional = list.stream().filter(n -> n % 2 == 0).sorted((a, b) -> b - a).skip(2).findFirst();
		System.out.println("The 3rd highest even number : " + optional);
	}

}
