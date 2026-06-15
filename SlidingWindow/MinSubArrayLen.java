public class MinSubArrayLen {
    public static int minSubArrayLen(int target, int nums[]) {
        int i = 0;
        int j = 0;
        int sum = 0;
        int minL = Integer.MAX_VALUE;

        while (j < nums.length) {
            
            sum += nums[j];

            while (sum >= target) {
                minL = Math.min(minL, (j - i + 1));
                sum -= nums[i];
                i++;
            }
            j++;

        }
        return minL;

    }

    public static void main(String[] args) {

        int[] nums = { 1, 4, 4,4 };
        int target = 4;

        int result = minSubArrayLen(target, nums);
        System.out.println("Minimum length = " + result);
    }

}
