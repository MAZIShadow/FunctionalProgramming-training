package org.home.mazi.functionalprogramming.chapter2;

import org.home.mazi.functionalprogramming.NoArgFunction;
import org.home.mazi.functionalprogramming.TriFunction;

import java.util.function.BiFunction;

public class Chapter2Video3 {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y;
		System.out.println(add.apply(1, 5));

		TriFunction<Integer, Integer, Integer, Integer> addThree = (x, y, z) -> x + y + z;
		System.out.println(addThree.apply(1, 5,4));

		NoArgFunction<String> sayHello = () -> "Say Hello";
		System.out.println(sayHello.apply());
	}
}
