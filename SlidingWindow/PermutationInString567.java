// LeetCode 567 - Permutation in String
// Fixed-size sliding window of length s1.length()
public class PermutationInString567 {

    public static boolean checkInclusion(String s1, String s2) {        if (s1.length() > s2.length()) {
            return false;
        }

        int[] need = new int[26];
        int[] window = new int[26];

        for (char ch : s1.toCharArray()) {
            need[ch - 'a']++;
        }

        int left = 0;
        int matches = 0;

        for (int right = 0; right < s2.length(); right++) {
            window[s2.charAt(right) - 'a']++;

            // maintain fixed window size
            if (right - left + 1 > s1.length()) {
                window[s2.charAt(left) - 'a']--;
                left++;
            }

            // check if current window is a permutation of s1
            if (right - left + 1 == s1.length()) {                matches = 0;
                for (int i = 0; i < 26; i++) {
                    if (need[i] == window[i]) {
                        matches++;
                    }
                }
                if (matches == 26) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";

        System.out.println("Permutation found: " + checkInclusion(s1, s2));
    }
}
