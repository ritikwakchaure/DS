package HashSet;

import java.util.HashSet;

public class singleNonDuplicate540 {

    public static int singleNonDuplicate(int nums[]) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {

            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }

        for (int ans : set) {
            return ans;
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 2, 2, 2, 3, 3, 4, 5, 5 };

        int result = singleNonDuplicate(arr);

        System.out.println("Single Element = " + result);
    }
}
