public class FirstOccurrenceString {
    // 28. Find the Index of the First Occurrence in a String

    /**
     * @param haystack
     * @param needle
     * @return
     */
    public static int firstOccurrenceString(String haystack, String needle) {

        int n = haystack.length();
        int m = needle.length();

        if (needle.isEmpty()) {
            return 0;
        }

        if (m > n) {
            return -1;
        }

        for (int i = 0; i <= n - m; i++) {
            if (haystack.substring(i, i + m).equals(needle))
                return i;
        }

        return -1;

    }

    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";

        int index = firstOccurrenceString(haystack, needle);

        System.out.println("Index = " + index);

        // More test cases
        System.out.println(firstOccurrenceString("hello", "ll")); // 2
        System.out.println(firstOccurrenceString("aaaaa", "bba")); // -1
        System.out.println(firstOccurrenceString("leetcode", "leet")); // 0

    }

}
