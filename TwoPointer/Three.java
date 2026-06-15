import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ThreeSum {

    public static List<List<Integer>> threeSum(int nums[]) {

        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {

            int left = i + 1;
            int right = nums.length - 1;

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    list.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    left++;
                    right--;

                    while (left < right && nums[left] == nums[left - 1])
                        left++;
                    while (left < right && nums[right] == nums[right + 1])
                        right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }

        }

        return list;

    }

    public static void main(String Argc[]) {

        int[] nums = { -1, 0, 1, 2, -1, -4 };

        List<List<Integer>> ans = threeSum(nums);
        System.out.println(ans);

    }
}