
// public class PivotIndex {

//     public static int pivotIndex(int[] nums) {

//         int sum = 0;
//         int left = 0;
//         int right = nums.length;

//         while (left <= right) {
//             int mid = (left + right) / 2;
//             if (mid[i] < right) {
//                 sum += left[i];
//             } else {
//                 sum += right[i];
//             }

//             if (left == right) {
//                 return i;
//             }
//         }

//         // int total = 0;
//         // for (int i = 0; i < nums.length; i++) {
//         // total += nums[i];
//         // }
//         // int left = 0;
//         // for (int i = 0; i < nums.length; i++) {
//         // int right = total - left - nums[i];

//         // if (left == right)
//         // return i;

//         // left += nums[i];

//         // }

//         return -1;
//     }

//     public static void main(String[] args) {
//         int[] nums = { 1
// , 7, 3, 8, 5, 6 };

//         int result = pivotIndex(nums);

//         System.out.println("Pivot Index = " + result);
//     }
// }

