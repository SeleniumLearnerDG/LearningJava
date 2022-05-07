package com.changeingconst;

public class CoverProblem {

        public int coverPoints(int[] A, int[] B) {
            int curX = A[0];
            int curY = B[0];
            // Counter
            int count = 0;

            for (int i = 1; i < A.length; i++) {
                // Get destination x and y
                int dstX = A[i];
                int dstY = B[i];

                // While we are not at the target position
                while (curX != dstX || curY != dstY) {
                    // Check x
                    if (curX < dstX) curX++;
                    else if (curX > dstX) curX--;

                    // Check y
                    if (curY < dstY) curY++;
                    else if (curY > dstY) curY--;

                    count++;
                }
            }

            return count;
        }

    public int coverPoints1(int[] A, int[] B) {
        int res = 0;
        for (int i = 0; i < A.length - 1; i++) {
            res += Math.max(Math.abs(A[i] - A[i + 1]), Math.abs(B[i] - B[i + 1]));
        }
        return res;
    }

}
