package com.changeingconst;

import java.util.TreeSet;

public class MaximumSumTriplet {
    public static void main(String[] args) {
        int a[] = {2, 5, 3, 1, 4, 9};//32592, 18763, 1656, 17411, 6360, 27625, 20538, 21549, 6484, 27596

        System.out.println(new MaximumSumTriplet().solve(a));
    }

    public int solve(int[] A) {
        int n = A.length;
        if (n < 3) return 0;

        int[] max = new int[n+1];
        max[n] = 0;
        for (int i = n-1; i >= 0; i--)
            max[i] = Math.max(A[i], max[i+1]);

        int maxSum = 0;
        TreeSet<Integer> set = new TreeSet<>();
        set.add(Integer.MIN_VALUE);
        for (int i = 0; i < n-1; i++) {
            if (max[i+1] > A[i])
                maxSum = Math.max(set.lower(A[i]) + A[i] + max[i+1], maxSum);
            set.add(A[i]);
        }

        return maxSum;
    }
}
