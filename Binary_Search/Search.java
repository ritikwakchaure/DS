package Binary_Search;

public class Search {

    public static int findPivote(int[] arr, int n) {

        int l = 0;
        int r = n - 1;

        while (l < r) {

            int mid = l + (r - l) / 2;

            if (arr[mid] > arr[r]) {
                l = mid + 1;
            } else {
                r = mid;
            }

        }
        return r;
    }

    public static int binarySearch(int[] nums, int l, int r, int target) {

        while (l <= r) {

            int mid = (l + r) / 2;

            if (nums[mid] == target) {
                return mid;

            }
            if (nums[mid] < target) {

                l = mid + 1;

            } else {
                r = mid - 1;
            }

        }
        return -1;
    }

    public static int search(int nums[], int target) {

        int n = nums.length;

        int pivote_index = findPivote(nums, n);

        if (nums[pivote_index] == target) {
            return pivote_index;
        }
        int idx = binarySearch(nums, pivote_index, n - 1, target); //left side walla index

        if(idx != -1){
             return  -1;
        }

      idx = binarySearch(nums, 0, pivote_index - 1, target); //right  side wala 

        return idx;

    }

    public static void main(String[] args) {

        int nums[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;

        int ans = search(nums, target);

        System.out.println("Target index: " + ans);
    }

}
