package org.home.mazi.functionalprogramming.chapter4;

public class Chapter4Video3
{
    static void countDown(Integer x) {

        if (x < 0) {
            System.out.println("Done!");
            return;
        }

        System.out.println(x);
        countDown(x - 1);
    }

    static void countUp(Integer x) {
        if (x > 10) {
            System.out.println("Done!");
            return;
        }

        System.out.println(x);
        countDown(x + 1);
    }

    public static void main(String[] args) {
        countDown(5);
        countUp(5);
    }
}
