import java.util.HashMap;

class LongestSubarrays {

    public static int longestSubarray(int[] a) {
        int one = 0, zero = 0, res = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < a.length; i++) {

            // Count 1s and 0s
            if (a[i] == 1) {
                one++;

            } else {
                zero++;
            }
            

            
            int diff = one - zero;

            // Case 1: equal from start
            if (diff == 0) {
                res = Math.max(res, i + 1);
            }

            // Case 2: first time diff seen
            if (!map.containsKey(diff)) {
                map.put(diff, i);
            } else {
                // Case 3: diff seen before
                int prevIndex = map.get(diff);
                res = Math.max(res, i - prevIndex);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 1, 1, 0 };

        int result = longestSubarray(arr);

        System.out.println("Longest subarray length: " + result);
    }
}