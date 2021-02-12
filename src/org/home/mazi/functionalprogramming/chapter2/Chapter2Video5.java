package org.home.mazi.functionalprogramming.chapter2;

import java.util.function.BiFunction;

public class Chapter2Video5 {

	public static void main(String[] args) {
		System.out.println(MyMath.combine2And3(MyMath::add));
		System.out.println(MyMath.combine2And3(MyMath::sub));
		System.out.println(MyMath.combine2And3((x, y) -> 2 * x + 2 * y));
	}

	protected static class MyMath {
		public static Integer add(Integer x, Integer y) {
			return x + y;
		}

		public static Integer sub(Integer x, Integer y) {
			return x - y;
		}

		public static Integer combine2And3(BiFunction<Integer, Integer, Integer> combineFunction) {
			return combineFunction.apply(2, 3);
		}
	}
}
