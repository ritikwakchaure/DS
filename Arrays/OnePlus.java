import static java.io.IO.println;
import java.util.Arrays;

// 66. Plus One
// 

class OnePlus {
    public static  int[] plusOne(int[] digits) {

        int n = digits.length - 1;

        for (int i = n; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;

                return digits;
            }

            digits[i] = 0;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;

        return result;

    }

     void main() {

         
        int[] digits = {9, 9, 9};

        int[] answer = plusOne(digits);

        println(Arrays.toString(answer));

    }
}