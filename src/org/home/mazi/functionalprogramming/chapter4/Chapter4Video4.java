package org.home.mazi.functionalprogramming.chapter4;

import java.util.function.Function;

public class Chapter4Video4 {
    public static void main(String[] args) {
        Function<Integer, Integer> timesTwo = x -> x * 2;
        Function<Integer, Integer> minusTwo = x -> x - 2;

        Function<Integer, Integer> timesTwoMinusTwo = minusTwo.compose(timesTwo);

        System.out.println(timesTwoMinusTwo.apply(10));
    }
}
