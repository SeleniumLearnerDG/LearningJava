package com.changeingconst;



public class NextSmallestPalindrome {
    public static void main(String[] args) {
        System.out.println(new NextSmallestPalindrome().solve("999"));
    }

    public String solve(String A) {
        String res = makePalindrom(A);
        Integer middle = (A.length() - 1)/2;
        if(res.compareTo(A) > 0) {
            return res;
        } else {
            res = nextValue(A, middle);
            res = makePalindrom(res);
        }
        return res;
    }

    public String makePalindrom(String str) {
        int len = str.length();
        char[] arr = str.toCharArray();
        for(int i = 0; i < len/2; i++) {
            arr[len - i - 1] = arr[i];
        }
        String res = String.valueOf(arr);
        return res;
    }

    public String nextValue(String str, int ind) {
        char[] arr = str.toCharArray();
        int len = str.length();
        if(ind == 0) {
            if(arr[0] == '9') {
                arr[0] = '0';
                return '1' + String.valueOf(arr);
            } else {
                Integer intChar = Integer.valueOf(String.valueOf(arr[0])) + 1;
                String ch = String.valueOf(intChar);
                arr[ind] = ch.toCharArray()[0];
            }
        } else if(arr[ind] == '9') {
            arr[ind] = '0';
            ind--;
            return nextValue(String.valueOf(arr), ind);
        } else {
            Integer intChar = Integer.valueOf(String.valueOf(arr[ind])) + 1;
            arr[ind] = String.valueOf(intChar).toCharArray()[0];
        }
        return String.valueOf(arr);
    }
}
