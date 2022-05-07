package com.changeingconst;

public class SortedPermutationRank {
    private static final int mod = 1000003;

    private static int fact(int n) {
        if ((n == 0) || (n == 1)) {

            return (1);

        }
        if (n < 0) {

            n = -n;

        }
        int f = 1;
        while (n > 0) {

            f = (f * n) % mod;
            n -= 1;

        }
        return (f);

    }

    private static int countSmallerCharsOnRt(final String A, final int end, final int start) {

        int i = start + 1, count = 0;
        while (i <= end) {

            if ((int) A.charAt(i) < (int) A.charAt(start)) {

                count += 1;

            }
            i += 1;

        }
        return (count);

    }

    public int findRank(final String A) {

        int len = A.length(), rank = 1;
        if ((len == 0) || (len == 1)) {

            return (1);

        }
        for (int i = 0; i < len; i += 1) {

            rank += countSmallerCharsOnRt(A, (len - 1), i) * fact(len - i - 1);
            rank %= mod;

        }
        return (rank);

    }
}
