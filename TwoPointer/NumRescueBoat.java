
import java.util.Arrays;

public class NumRescueBoat {
    public static int numRescueBoat(int[] nums, int limit) {
        Arrays.sort(nums);
        int count = 0;
        int i = 0, j = nums.length - 1;
        while (i <= j) {
            if (nums[i] + nums[j] <= limit) {
                i++;

            }
            j--;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 2, 1, 5 };
        int limit = 3;
         numRescueBoat(arr, limit);

        System.out.println("Result: " + numRescueBoat(arr, limit));
    }

}
