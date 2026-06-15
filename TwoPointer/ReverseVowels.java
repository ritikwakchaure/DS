public class ReverseVowels {

    static boolean isVowels(char c) {

        return c == 'a' || c == 'e' ||
                c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' ||
                c == 'O' || c == 'U';

    }

    public static String reverseVowels(String s) {
        char[] arr = s.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            while (left < right && !isVowels(arr[left])) {
                left++;
            }

            while (left < right && !isVowels(arr[right])) {
                right--;
            }
            char ch = arr[left];
            arr[left] = arr[right];
            arr[right] = ch;

            left++;
            right--;

        }

        return new String(arr);

    }

    public static void main(String[] args) {
        // System.out.println(reverseVowels("w3resource"));
        System.out.println(reverseVowels("Java"));
        System.out.println(reverseVowels("Perl"));
    }

}
