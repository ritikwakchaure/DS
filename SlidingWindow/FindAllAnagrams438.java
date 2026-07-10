import java.util.ArrayList;
import java.util.List;

// LeetCode 438 - Find All Anagrams in a String
// Fixed-size window; compare frequency arrays at each step
public class FindAllAnagrams438 {
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        if (p.length() > s.length()) {
            return result;
        }

        int[] need = new int[26];
        int[] window = new int[26];

        for (char ch : p.toCharArray()) {
            need[ch - 'a']++;
        }

        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            window[s.charAt(right) - 'a']++;

            if (right - left + 1 > p.length()) {
                window[s.charAt(left) - 'a']--;
                left++;
            }

            if (right - left + 1 == p.length()) {
                boolean isAnagram = true;
                for (int i = 0; i < 26; i++) {
                    if (need[i] != window[i]) {
                        isAnagram = false;
                        break;
                    }
                }
                if (isAnagram) {
                    result.add(left);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";

        System.out.println("Anagram indices: " + findAnagrams(s, p));
    }
}
