package com.changeingconst;

public class ComplementProblem {
    public static int bitwiseComplement(int n) {
        if(n==0) return 1;
        int i = 0, j = 0;
        while(i < n){
            i += Math.pow(2, j);
            j++;
        }
        int ans = n ^ i;
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(bitwiseComplement(10));
    }
}
