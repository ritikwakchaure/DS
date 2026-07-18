import java.util.Arrays;

class OnePlus {
    public int[] plusOne(int[] digits) {

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

    public static void main(String[] args) {

         
        int[] digits = {9, 9, 9};

        int[] answer = plusOne(digits);

        System.out.println(Arrays.toString(answer));

    }
}