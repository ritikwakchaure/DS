// LeetCode 1004 - Max Consecutive Ones III
// At most k zeros allowed in the window
public class MaxConsecutiveOnesIII1004 {

    public static int longestOnes(int[] nums, int k) {        int left = 0;
        int zeros = 0;
        int maxLen = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeros++;
            }

            while (zeros > k) {
                if (nums[left] == 0) {
                    zeros--;
                }
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
        int k = 2;

        System.out.println("Longest ones after flips: " + longestOnes(nums, k));
    }
}
