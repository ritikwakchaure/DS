// LeetCode 487 - Max Consecutive Ones II
// At most 1 zero allowed in the window
public class LongestOnes487 {

    public static int findMaxConsecutiveOnes(int[] nums) {        int left = 0;
        int zeros = 0;
        int maxLen = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeros++;
            }

            while (zeros > 1) {
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
        int[] nums = { 1, 0, 1, 1, 0, 1 };

        System.out.println("Longest consecutive ones: " + findMaxConsecutiveOnes(nums));
    }
}
