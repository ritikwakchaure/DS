public class LongestSubarraySumK {
    public static int longestSubarraySumK(int[] nums, int k) {
        int left = 0, right = 0;
        int currentSum = 0;
        int maxLength = 0;

        while (right < nums.length) {
            currentSum += nums[right];

            while (currentSum > k && left <= right) {
                currentSum -= nums[left];
                left++;
            }

            if (currentSum == k) {
                maxLength = Math.max(maxLength, right - left + 1);
            }

            right++;
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {1, -1, 5, -2, 3};
        int k = 3;

        int result = longestSubarraySumK(nums, k);

        System.out.println("Length of longest subarray with sum " + k + " = " + result);
    }   
}

