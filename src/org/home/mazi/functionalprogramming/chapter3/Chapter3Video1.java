package org.home.mazi.functionalprogramming.chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Chapter3Video1 {
	public static void main(String[] args) {
		Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(intArray));
		List<Integer> doubled = new ArrayList<>();

		for (int i = 0; i < listOfIntegers.size(); i++) {
			Integer result = listOfIntegers.get(i) * 2;
			doubled.add(result);
		}


		// NEW WAy using STREAMS, Functions

		Function<Integer, Integer> timesTo = (x) -> x * 2;
		List<Integer> doubled2 = listOfIntegers
				.stream()
				.map(timesTo)
				.collect(Collectors.toList());

		System.out.println(doubled);
	}
}
