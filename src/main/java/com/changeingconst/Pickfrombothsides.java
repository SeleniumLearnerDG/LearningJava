package com.changeingconst;

public class Pickfrombothsides {

    public static void main(String[] args) {
        int[] arr = {5, -2, 3, 1, 2};
        System.out.println(solve(arr, 3));

    }

    public static int solve(int[] A, int B) {

        int n = A.length;

        int result = 0;

        for (int i = 0; i < B; i++) {
            result += A[i];
        }

        int sum = result;

        for (int i = 0; i < B; i++) {
            sum -= A[B - 1 - i];
            sum += A[n - 1 - i];

            result = Math.max(result, sum);
        }

        return result;

    }

}
