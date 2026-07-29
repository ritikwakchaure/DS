
import java.util.Arrays;

// Rearrange an array in maximum minimum form using Two Pointer Technique Given
// a sorted array of positive integers, rearrange the array alternately i.e
// first element should be a maximum value, at second position minimum value, at
// third position second max, at fourth position second min, and so on.
// Examples: Input: arr[] = {1, 2, 3, 4, 5, 6, 7}

class Rearrange {

    public static void rearrange(int[] nums) {
        int[] temp = new int[nums.length];

        int left = 0;
        int right = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {

            if (i % 2 == 0) {
                temp[i] = nums[right--];

            } else {

                temp[i] = nums[left++];

            }
        }

        for (int i = 0; i < temp.length; i++) {
            nums[i] = temp[i];

        }

    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };

        rearrange(nums);

        System.out.println(Arrays.toString(nums));
    }
}