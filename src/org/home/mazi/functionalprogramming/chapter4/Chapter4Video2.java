package org.home.mazi.functionalprogramming.chapter4;

import org.home.mazi.functionalprogramming.TriFunction;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Chapter4Video2 {
    public static void main(String[] args) {
        TriFunction<Integer, Integer, Integer, Integer> add = (x, y, z) -> x + y + z;

        //BiFunction<Integer, Integer, Function<Integer, Integer>> addPartial = (x,y) -> (z) -> add.apply(x,y,z);
        Function<Integer,Function<Integer,Function<Integer,Integer>>> addPartial = (x)->(y)->(z) -> add.apply(x,y,z);

        Function<Integer, Function<Integer, Integer>> add5 = addPartial.apply(5);
        Function<Integer, Integer> add5And6 = add5.apply(6);
        Integer sum = add5And6.apply(7);
        System.out.println(sum);

        //Function<Integer, Integer> add5And6 = addPartial.apply(5,6);

        System.out.println(add5And6.apply(7));

//        BiFunction<Integer,Integer,Integer> add5 = addPartial.apply(5);
//
//        System.out.println(add5.apply(6,7));
    }
}
