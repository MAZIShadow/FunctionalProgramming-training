package org.home.mazi.functionalprogramming.chapter2;

import org.home.mazi.functionalprogramming.NoArgFunction;

public class Chapter2Video7 {
	public static void main(String[] args) {
		NoArgFunction<NoArgFunction<String>> createGreeter = () -> {
			String name = "MAZI_";

			return () -> "Hello, " + name;
		};

		NoArgFunction<String> greeter = createGreeter.apply();
		System.out.println(greeter.apply());
	}
}
