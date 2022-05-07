package com.changeingconst;

public class TrailingZerosinFactorial {
    public int trailingZeroes(int A) {
        int num=0;
        while(A>=1)
        {
            num+=A/5;
            A=A/5;
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(new TrailingZerosinFactorial().trailingZeroes(4617));
    }
}
