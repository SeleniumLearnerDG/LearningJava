package com.changeingconst;

public class isPalindrome {
    public  static boolean isPalindromeSolution(int x) {
        String str = String.valueOf(x);
        int backward = str.length()-1;

        for (int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(backward)){
                return false;
            }
            backward--;
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(isPalindromeSolution(0));
    }
}
