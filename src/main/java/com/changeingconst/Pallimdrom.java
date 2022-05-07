package com.changeingconst;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pallimdrom {

    public static boolean isPalindrome(String s, int min) {
        if (s.length() < min) return false;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int k = 3;
        String s = "abaabba";
        palindrome(s, k);

    }

    public static void palindrome(String s, int min) {

        for (int i = 0; i <= s.length(); i++) {
            for (int j = i + 1; j <=s.length(); j++) {
                if (isPalindrome(s.substring(i, j), min)) {
                    System.out.print(s.substring(i, j) + " ");
                    palindrome(s.substring(j),min);
                    System.out.println();
                }
            }
        }
    }



}
