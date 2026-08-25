class maxAbsoluteSum {

    // bf
    public static int maAbsoluteSum(int nums[]) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;

            for (int j = i; j < nums.length; j++) {

                sum += nums[j];

                ans = Math.max(ans, Math.abs(sum));

            }
        }
        return ans;
    }

    public static int maxAbsoluteSum(int nums[]) {
        int maxCurrent = nums[0];
        int maxSum = nums[0];

        for (int num : nums) {

            maxCurrent = Math.max(num, maxCurrent + num);
            maxSum = Math.max(maxSum, maxCurrent);

        }

        int minCurrent = nums[0];
        int minSum = nums[0];

        for (int num : nums) {

            minCurrent = Math.min(num, minCurrent + num);
            minSum = Math.min(minSum, minCurrent);

        }

        return Math.max(maxSum, Math.abs(minSum));
    }

    public static void main(String[] args) {

        int[] nums = { 1, -3, 6, 3, -4 };

        int result = maxAbsoluteSum(nums);

        System.out.println("Maximum Absolute Sum = " + result);
    }
}