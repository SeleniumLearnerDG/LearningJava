package com.changeingconst;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Duplicate {
    public static void main(String[] args) {
        String s="abbbbcdaaaaabbbeeerrraaaafgh1a";
        System.out.println(NonduplicateValue(s));
    }

    public static Map<Character, Integer> duplicateValue(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        HashSet<Character> hashSet = new HashSet<Character>();
        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            if (hashSet.contains(ch)) {
                if (map.containsKey(ch)) {
                    map.put(ch, map.get(ch) + 1);
                } else {
                    map.put(ch, 2);
                }
            } else
                hashSet.add(ch);
        }
        return  map;
    }

    public static HashSet<Character> NonduplicateValue(String s) {
        HashSet<Character> cHaset = new HashSet<>();
        String duplicate = "";
        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            if (cHaset.contains(ch)) {
                cHaset.remove(ch);
                duplicate = duplicate + ch;
            } else if (!duplicate.contains(ch.toString()))
                cHaset.add(ch);
        }
        return cHaset;
    }
}
