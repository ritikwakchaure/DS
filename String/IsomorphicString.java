import java.util.HashMap;

class IsomorphicString {
    public static boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> mp1 = new HashMap<>();
        HashMap<Character, Character> mp2 = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {

            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if (mp1.containsKey(ch1) && mp1.get(ch1) != ch2) {
                return false;
            }

            if (mp1.containsKey(ch2) && mp1.get(ch2) != ch1) {
                return false;
            }
            mp1.put(ch1, ch2);
            mp2.put(ch2, ch1);
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "add";

        String t = "egg";

        if (isIsomorphic(s, t)) {
            System.out.println("Strings are Isomorphic.");
        } else {
            System.out.println("Strings are NOT Isomorphic.");
        }

    }
}