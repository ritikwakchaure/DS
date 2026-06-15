
import java.util.HashSet;
import java.util.Set;

public class Isogram {

    // An isogram (also known as a "nonpattern word") is a logological term for a
    // word or phrase without a repeating letter. It is also used by some people to
    // mean a word or phrase in which each letter appears the same number of times,
    // not necessarily just once. Conveniently, the word itself is an isogram in
    // both senses of the word, making it autological.
    // Write a Java program to check whether a given string is an "isogram" or not.
    public static  boolean isSogram(String s) {

        Set<Character> set = new HashSet<>();

        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == ' ') {
                continue;
            }

            if (set.contains(ch)) {
                return false;
            }
            set.add(ch);
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isSogram("java"));
    }
}
