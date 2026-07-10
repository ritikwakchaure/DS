
import java.util.*;


public class FirstNegativeWindowsofSizeK {


    // static List<Integer> firstNegInt(int arr[], int k) {
    //     // code here
    //     List<Integer> ans = new ArrayList<>();

    //     for (int i = 0; i <= arr.length - k; i++) {
    //         boolean found = false;

    //         for (int j = i; j < i + k; j++) {
    //             if (arr[j] < 0) {
    //                 ans.add(arr[j]);

    //                 found = true;
    //                 break;

    //             }
    //         }

    //         if (!found) {
    //             ans.add(0);
    //         }

    //     }

    //     return ans;
    // }

    public static void main(String[] args) {

          int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
                int k = 3;
        
                Queue<Integer> q = new LinkedList<>();
                List<Integer> ans = new ArrayList<>();
        
                for (int i = 0; i < arr.length; i++) {
        
                    if (arr[i] < 0) {
                        q.offer(i);
                    }
        
                    if (i >= k - 1) {
        
                        while (!q.isEmpty() && q.peek() < i - k + 1) {
                            q.poll();
                        }
        
                        if (q.isEmpty()) {
                            ans.add(0);
                        } else {
                            ans.add(arr[q.peek()]);
                        }
                    }
                }
        
                System.out.println(ans);

    }

}