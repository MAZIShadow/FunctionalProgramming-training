package org.home.mazi.functionalprogramming.chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Chapter3Video2 {
	public static void main(String[] args) {
		Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(intArray));

		List<Integer> events = new ArrayList<>();
		for (Integer listOfInteger : listOfIntegers) {
			boolean isEven = listOfInteger % 2 == 0;

			if (isEven) {
				events.add(listOfInteger);
			}
		}

		Predicate<Integer> isEven = (x) -> x % 2 == 0;
		List<Integer> evens2 = listOfIntegers.stream().filter(isEven).collect(Collectors.toList());

		System.out.println(evens2);

		String[] wordsArr = {"hello", "functional", "programming", "is", "cool"};
		List<String> words = new ArrayList<>(Arrays.asList(wordsArr));

		Predicate<String> isLongerThan5 = (str) -> str.length() > 5;

		List<String> longWords = words
				.stream()
				.filter(isLongerThan5)
				.collect(Collectors.toList());

		System.out.println(longWords);

		Function<Integer, Predicate<String>> createLengthTest = (minLength) -> (str) -> str.length() > minLength;
		Predicate<String> isLongerThan3 = createLengthTest.apply(3);

		longWords = words
				.stream()
				.filter(isLongerThan3)
				.collect(Collectors.toList());
		System.out.println(longWords);

		Predicate<String> isLongerThan10 = createLengthTest.apply(10);

		longWords = words
				.stream()
				.filter(isLongerThan10)
				.collect(Collectors.toList());
		System.out.println(longWords);


	}
}
