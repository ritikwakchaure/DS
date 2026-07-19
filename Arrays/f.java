import java.util.Arrays;

public class f {

    public static int[] twoSum(int[] nums, int target) {

        // for (int i = 0; i < nums.length; i++) {

        // for (int j = 1; j < nums.length ; j++) {

        // if (nums[i] + nums[j] == target) {
        // return true;
        // }
        // }
        // }
        // return false;

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            int sum = nums[left] + nums[right];

            if (sum == target) {
                return new int[] { left + 1, right + 1 };
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }

        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 7, 8, 9 };
        int target = 17;

        System.out.println(Arrays.toString(twoSum(arr, target)));

    }

}
