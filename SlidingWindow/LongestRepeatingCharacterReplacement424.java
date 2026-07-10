// LeetCode 424 - Longest Repeating Character Replacement
// Window is valid when (windowSize - maxFreq) <= k
public class LongestRepeatingCharacterReplacement424 {

    public static int characterReplacement(String s, int k) {        int[] count = new int[26];
        int left = 0;
        int maxFreq = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            int idx = s.charAt(right) - 'A';
            count[idx]++;
            maxFreq = Math.max(maxFreq, count[idx]);

            // chars to replace = window size - most frequent char count
            while ((right - left + 1) - maxFreq > k) {                count[s.charAt(left) - 'A']--;
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;

        System.out.println("Longest repeating length: " + characterReplacement(s, k));
    }
}
