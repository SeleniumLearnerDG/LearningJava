import java.util.HashMap;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int length = 0;
        if (s.length() == 0) return length;
        String s1 = "";
        length = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (s1.contains(String.valueOf(ch))) {

                s1 = s1.substring(s1.indexOf(ch) + 1);

            }
            s1 += ch;
            length = s1.length() > length ? s1.length() : length;
        }
        return length;

    }
//    public int lengthOfLongestSubstring(String s) {
//        if (s.length() <= 1) return s.length();
//        HashMap<Character, Integer> seenChars = new HashMap<>();
//        int left = 0, longest = 0;
//        for (int right = 0 ; right < s.length(); right++) {
//            char currentChar = s.charAt(right);
//            Integer prevSeenChar = seenChars.get(currentChar);
//            if (prevSeenChar != null && prevSeenChar >= left) {
//                left = prevSeenChar + 1;
//            }
//            seenChars.put(currentChar, right);
//            longest = Math.max(longest, right-left+1);
//        }
//        return longest;
//
//    }
    public static void main(String[] args) {
        System.out.println(new LongestSubstring().lengthOfLongestSubstring("au"));
    }
}
