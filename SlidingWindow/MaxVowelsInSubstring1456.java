// LeetCode 1456 - Maximum Number of Vowels in a Substring of Given Length
// Fixed-size window of length k
public class MaxVowelsInSubstring1456 {

    public static int maxVowels(String s, int k) {        int left = 0;
        int vowelCount = 0;
        int maxVowels = 0;

        for (int right = 0; right < s.length(); right++) {
            if (isVowel(s.charAt(right))) {
                vowelCount++;
            }

            if (right - left + 1 > k) {
                if (isVowel(s.charAt(left))) {
                    vowelCount--;
                }
                left++;
            }

            maxVowels = Math.max(maxVowels, vowelCount);
        }

        return maxVowels;
    }

    private static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;

        System.out.println("Max vowels in window: " + maxVowels(s, k));
    }
}
