import java.util.HashMap;

// LeetCode 76 - Minimum Window Substring
// Expand right to include chars, shrink left when all chars of t are covered
public class MinimumWindowSubstring76 {

    public static String minWindow(String s, String t) {        if (s.length() < t.length()) {
            return "";
        }

        // frequency map of characters needed from t
        HashMap<Character, Integer> need = new HashMap<>();
        for (char ch : t.toCharArray()) {
            need.put(ch, need.getOrDefault(ch, 0) + 1);
        }

        int left = 0;
        int formed = 0; // how many unique chars have exact required count
        int required = need.size();        int minLen = Integer.MAX_VALUE;
        int minStart = 0;

        HashMap<Character, Integer> window = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            window.put(ch, window.getOrDefault(ch, 0) + 1);

            // update formed when a char reaches its required frequency
            if (need.containsKey(ch) && window.get(ch).intValue() == need.get(ch).intValue()) {
                formed++;
            }

            // shrink window while it still contains all chars of t
            while (formed == required) {                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    minStart = left;
                }

                char leftChar = s.charAt(left);
                window.put(leftChar, window.get(leftChar) - 1);

                if (need.containsKey(leftChar) && window.get(leftChar) < need.get(leftChar)) {
                    formed--;
                }
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";

        System.out.println("Minimum window: " + minWindow(s, t));
    }
}
