import java.util.HashMap;

// LeetCode 159 - Longest Substring with At Most Two Distinct Characters
public class LongestSubstringTwoDistinct159 {
    public static int lengthOfLongestSubstringTwoDistinct(String s) {
        HashMap<Character, Integer> count = new HashMap<>();
        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            count.put(ch, count.getOrDefault(ch, 0) + 1);

            while (count.size() > 2) {
                char leftChar = s.charAt(left);
                count.put(leftChar, count.get(leftChar) - 1);
                if (count.get(leftChar) == 0) {
                    count.remove(leftChar);
                }
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        String s = "eceba";

        System.out.println("Longest two distinct: " + lengthOfLongestSubstringTwoDistinct(s));
    }
}
