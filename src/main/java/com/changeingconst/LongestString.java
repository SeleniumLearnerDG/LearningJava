package com.changeingconst;

import java.util.HashSet;
import java.util.Set;

public class LongestString {
    public static int lengthOfLongestSubstring(String s) {
        if(s==null || s.length()==0) return 0;
        Set<Character> set=new HashSet<>();
        int j=0,i=0, max=1;
        while(j<s.length())
        {
            while(set.contains(s.charAt(j)))
            {
                set.remove(s.charAt(j));
                ++i;
            }
            set.add(s.charAt(j));
            max=Math.max(max,(j-i+1));
            j++;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
