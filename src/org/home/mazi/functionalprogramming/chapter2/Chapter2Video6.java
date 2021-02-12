package org.home.mazi.functionalprogramming.chapter2;

import org.home.mazi.functionalprogramming.NoArgFunction;

import java.util.function.Function;
import java.util.stream.IntStream;

public class Chapter2Video6 {

	protected static class MyMath {
		public static Integer timesTwo(Integer x) {
			return x * 2;
		}

		public static Integer timesThree(Integer x) {
			return x * 3;
		}

		public static Integer timesFour(Integer x) {
			return x * 4;
		}

		// below you have solution for above all methods


		public static Function<Integer, Integer> createMultiplier(Integer y) {
			return (Integer x) -> x * y;
		}
	}

	public static void main(String[] args) {
		NoArgFunction<NoArgFunction<String>> createPrinter = () -> () -> "Hello Functional";
		NoArgFunction<String> greeter = createPrinter.apply();
		System.out.println(greeter.apply());

		//Function<Integer, Integer> timesTwo = MyMath::timesTwo;
		Function<Integer, Integer> timesTwo = MyMath.createMultiplier(2);
		//Function<Integer, Integer> timesThree = MyMath::timesThree;
		Function<Integer, Integer> timesThree = MyMath.createMultiplier(3);
		//Function<Integer, Integer> timesThree = MyMath::timesFour;
		Function<Integer, Integer> timesFour = MyMath.createMultiplier(4);

		System.out.println(timesTwo.apply(6));
		System.out.println(timesThree.apply(6));
		System.out.println(timesFour.apply(6));

		//

		IntStream.rangeClosed(2,4).forEach(i -> System.out.println(MyMath.createMultiplier(i).apply(6)));
	}
}
