class RemoveDuplicate {
    // 26. Remove Duplicates from Sorted Array

    public int removeDuplicate(int[] nums) {
        int n = nums.length - 1;

        int i = 0;
        int j = 1;

        while (i < n) {

            if (nums[i] != nums[j]) {
                nums[i] = nums[j];

                i++;

            }

            j++;

        }
        return j;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2 };
        RemoveDuplicate removeduplicate = new RemoveDuplicate();

        int k = removeduplicate.removeDuplicate(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[k] + "");
        }
    }
}