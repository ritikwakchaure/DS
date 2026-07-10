import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

// LeetCode 239 - Sliding Window Maximum
// Monotonic deque stores indices of decreasing elements
public class SlidingWindowMaximum239 {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < nums.length; i++) {
            // remove index outside current window
            while (!dq.isEmpty() && dq.peekFirst() < i - k + 1) {
                dq.pollFirst();
            }

            // remove smaller elements from back
            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {                dq.pollLast();
            }

            dq.offerLast(i);

            if (i >= k - 1) {
                result[i - k + 1] = nums[dq.peekFirst()];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k = 3;

        System.out.println("Window maximums: " + Arrays.toString(maxSlidingWindow(nums, k)));
    }
}
