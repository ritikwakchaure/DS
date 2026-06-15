import java.util.ArrayList;
import java.util.List;

public class CountNegativeWithPositiveSum {

// Write a Java program that accept a list of numbers and create a list to store the count of negative number in first element and store the sum of positive numbers in second element.
// Sample Output:
// [0, 15]
// [5, 0]
// [2, 6]
// [3, 3]

public static List<Integer> countNegativesSumPositives(int arr[]){
     int negativeCount = 0;
     int positiveCount = 0;

     for(int   num : arr){
        if(num < 0){
            negativeCount++;
        } else if(num > 0){
            positiveCount +=num;
        }
     }

     List<Integer> list = new ArrayList<>();
     list.add(negativeCount);
     list.add(positiveCount);

     return  list;

}

public static void main(String[] args) {
    int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {-1, -2, -3, -4, -5};
        int[] arr3 = {-1, -2, 1, 2, 3};
        int[] arr4 = {-1, -2, -3, 1, 2};

        System.out.println(countNegativesSumPositives(arr1)); // [0, 15]
        System.out.println(countNegativesSumPositives(arr2)); // [5, 0]
        System.out.println(countNegativesSumPositives(arr3)); // [2, 6]
        System.out.println(countNegativesSumPositives(arr4)); // [3, 3]
}

}
