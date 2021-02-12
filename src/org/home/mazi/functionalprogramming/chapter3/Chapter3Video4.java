package org.home.mazi.functionalprogramming.chapter3;

import java.util.*;
import java.util.stream.Collectors;

public class Chapter3Video4 {
	public static void main(String[] args) {
		String[] wordsArr = {"hello", "functional", "programming", "is", "cool"};
		List<String> words = new ArrayList<>(Arrays.asList(wordsArr));

		List<String> list = words
				.stream()
				.filter((word) -> word.length() > 5)
				.collect(Collectors.toList());

		Set<String> set = words
				.stream()
				.filter((word) -> word.length() > 5)
				.collect(Collectors.toSet());

		String joining = words
				.stream()
				.filter((word) -> word.length() > 5)
				.collect(Collectors.joining("--"));

		Long howMany = words
				.stream()
				.filter((word) -> word.length() > 5).count(); // <-- same as below
				//.collect(Collectors.counting());

		Map<Integer, List<String>> listMap = words
				.stream()
				.collect(Collectors.groupingBy(
						String::length
				));

		Map<Boolean, List<String>> booleanListMap = words
				.stream()
				.collect(Collectors.partitioningBy((word) -> word.length() > 5));

		System.out.println(list);
		System.out.println(set);
		System.out.println(joining);
		System.out.println(howMany);
		System.out.println(listMap);
		System.out.println(booleanListMap);


	}
}
