
public class BeautySum {

    public static int beautySum(String s) {

        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            int[] count = new int[26];

            for (int j = i; j < s.length(); j++) {

                char ch = s.charAt(j);
                count[ch - 'a']++;

            }
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int k = 0; k < 26; k++) {
                if (count[k] > 0) {
                    min = Math.min(min, count[k]);
                    max = Math.max(max, count[k]);
                }
            }

            sum += max - min;
        }
        return sum;

    }

    public static void main(String[] args) {

        String s1 = "aab";
        String s2 = "aabcbaa";
        String s3 = "abc";
        String s4 = "aaaa";

        System.out.println("Input: " + s1);
        System.out.println("Output: " + beautySum(s1));
        System.out.println("Expected: 1");

        System.out.println("------------------");

        System.out.println("Input: " + s2);
        System.out.println("Output: " + beautySum(s2));
        System.out.println("Expected: 17");

        System.out.println("------------------");

        System.out.println("Input: " + s3);
        System.out.println("Output: " + beautySum(s3));
        System.out.println("Expected: 0");

        System.out.println("------------------");

        System.out.println("Input: " + s4);
        System.out.println("Output: " + beautySum(s4));
        System.out.println("Expected: 0");

    }

}
