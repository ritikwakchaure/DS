
// import java.util.HashMap;

// public class SubarraySum {

//     public static int subarraySum(int[] nums, int k) {
//         HashMap<Integer, Integer> freq = new HashMap<>();
//         freq.put(0, 1);
//         int sum = 0;
//         int count = 0;

//         for (int idx = 0; idx < nums.length; idx++) {
//             sum += nums[idx];

//             int ques = sum - k;

//             int frequncy = freq.getOrDefault(ques, 0);

//             count += frequncy;
//             freq.put(sum, freq.getOrDefault(sum, 0) + 1);

//         }
//         return count;

//     }

//     public static void main(String[] args) {

//         int[] arr = { 1, 2, 3, 4, 5 };
//         int k = 3;
//         int result = subarraySum(arr, k);

//         System.out.println("Sum of SubArrysSums: " + result);

//     }

// }


// public class Main {
//     public static void main(String[] args) throws InterruptedException {
//         Worker w = new Worker();
//         w.start();
//         Thread.sleep(2000); // 2 sec baad interrupt karo
//         w.interrupt();
//     }
// }

public  static int self(int arr[]){
    for(int i = 0; i<arr.length;i++){
        int pro = 0;
        for(int j=0; j< arr.length; j++){
            if(i == j ){
                continue;
            }
            else{
                pro *= arr[j];
            }
        }
    }
}