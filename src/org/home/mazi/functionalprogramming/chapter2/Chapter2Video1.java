package org.home.mazi.functionalprogramming.chapter2;

import java.util.function.Function;

public class Chapter2Video1 {

	public static void main(String[] args) {
		Function<Integer, Integer> myTriple = MyMath::triple;
		Integer result = myTriple.apply(5);

		System.out.println(result);
	}

	protected static class MyMath {
		public static Integer triple(Integer x) {
			return x * 3;
		}
	}
}
