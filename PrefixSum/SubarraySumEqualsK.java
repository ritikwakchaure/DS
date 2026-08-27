
import java.util.HashMap;

public class SubarraySumEqualsK {

    public int subarraySum(int[] nums, int k) {

        int sum = 0;
        int count = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;

    }

    public static void main(String[] args) {

        SubarraySumEqualsK obj = new SubarraySumEqualsK();

        // Test Case 1
        int[] nums1 = { 1, 1, 1 };
        int k1 = 2;

        System.out.println(obj.subarraySum(nums1, k1));
        // Output: 2

        // Test Case 2
        int[] nums2 = { 1, 2, 3 };
        int k2 = 3;

        System.out.println(obj.subarraySum(nums2, k2));
        // Output: 2

        // Test Case 3
        int[] nums3 = { 1, -1, 0 };
        int k3 = 0;

        System.out.println(obj.subarraySum(nums3, k3));
    }
}
