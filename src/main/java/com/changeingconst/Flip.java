package com.changeingconst;

public class Flip {
    public class Solution {
        /*
        010
        112
        011
        1
        1
        */
        public int[] flip(String A) {
            int res[]=new int[2];
            int curr=0;
            int count=0;
            int l=0;

            for(int r=0;r<A.length();r++)
            {
            if(A.charAt(r)=='0')
                count++;
            else
                count--;
            if(count>curr)
            {
                res[0]=l+1;
                res[1]=r+1;
                curr=count;
            }
            if(count<0)
            {
                count=0;
                l=r+1;
            }

            }

            return res[0]==0?new int[]{}:res;
        }
    }

}
