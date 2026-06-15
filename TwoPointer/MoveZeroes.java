
public class MoveZeroes {

    public static void moveZeroes(int[] nums) {

        int[] result = new int[nums.length];
        int pos = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                result[pos] = nums[i];
                pos++;

            }

        }

        while (pos < nums.length) {
            result[pos] = 0;
            pos++;
        }

        for(int i = 0; i < nums.length; i++) {

            nums[i] = result[i];

        }

    }

    public static void main(String[] args) {

        int[] nums = { 0, 1, 0, 3, 12 };

        moveZeroes(nums);

        System.out.print("Array after moving zeroes: ");

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}