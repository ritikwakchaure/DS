 package  Binary_Search;

public class SingleNonDuplicateEle {

    public static int singleNonDuplicate(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans = ans ^ nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 3, 4, 4 };

        singleNonDuplicate(arr);

    }
}