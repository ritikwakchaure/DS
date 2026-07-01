package HashMap;
import java.util.HashMap;

public class Valid_Anagram242 {

    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        if(s.length() != t.length()) return false;

        for (int i = 0; i < s.length(); i++) {

            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            map.put(ch1, map.getOrDefault(ch1, 0) + 1);
            map.put(ch2, map.getOrDefault(ch2, 0) - 1);

        }

        for (int count : map.values()) {
            if (count != 0)
                return false;
        }

        return true;

    }

    public static void main(String[] args) {

        Valid_Anagram242 obj = new Valid_Anagram242();
        String s = "anagrmm";
        String t = "nagarrm";

        boolean ans = obj.isAnagram(s, t);

        System.out.println(ans);

    }

}
