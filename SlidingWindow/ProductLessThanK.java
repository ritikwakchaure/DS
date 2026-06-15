class ProductLessThanK {
    // 1.BF
    // public static int longestSubarrayProductLessThanK(int[] nums, int k) {
    // int n = nums.length;
    // int count = 0;

    // for (int i = 0; i < n; i++) {
    // int product = 1;

    // for (int j = i; j < n; j++) {
    // product *= nums[j];

    // if (product < k) {
    // count++;
    // } else {
    // break; // optimization (important)
    // }
    // }
    // }
    // return count;
    // }
    public static int longestSubarrayProductLessThanK(int[] nums, int k) {
        int i = 0;
        int n = nums.length;
        int j = 0;
        int count = 0;
        int product = 1;

        while (j < n) {
            product *= nums[j];

            while (product >= 100) {
                product /= nums[i];
                i++;
            }
            count += (j - i + 1);
            j++;
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = { 10, 23,3, 6 };
        int k = 100;

        int result = longestSubarrayProductLessThanK(nums, k);
        System.out.println("Count of subarrays: " + result);
    }
}