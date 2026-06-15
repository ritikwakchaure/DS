import java.util.HashMap;

public class WordPattern {

    // Approach 2 — char/word to index+1 mapping
    public boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");
        int n = pattern.length();

        // length mismatch → false
        if (words.length != n) return false;

        HashMap<Character, Integer> charToIndex = new HashMap<>();
        HashMap<String, Integer>    wordToIndex = new HashMap<>();

        for (int i = 0; i < n; i++) {
            char   c    = pattern.charAt(i);
            String word = words[i];

            /*
             * getOrDefault(key, 0) — agar key map mein nahi hai to 0 return karo
             * i+1 store karte hain kyunki 0 = "kabhi nahi dekha"
             * Agar i store karte (0 se start) to i=0 aur "never seen" dono 0 hote — BUG!
             */
            int charIdx = charToIndex.getOrDefault(c, 0);
            int wordIdx = wordToIndex.getOrDefault(word, 0);

            if (charIdx != wordIdx) {
                return false; // mismatch — pattern toot gaya
            }

            // dono ko same index se map karo
            charToIndex.put(c,    i + 1);
            wordToIndex.put(word, i + 1);
        }

        return true;
    }

    // -------------------------
    // Test cases
    // -------------------------
    public static void main(String[] args) {
        WordPattern sol = new WordPattern();

        // Test 1 → true
        System.out.println("Test 1: " + sol.wordPattern("abba", "dog cat cat dog"));   // true

        // Test 2 → false (fish != dog)
        System.out.println("Test 2: " + sol.wordPattern("abba", "dog cat cat fish"));  // false

        // Test 3 → false (a aur b dono dog se map nahi ho sakte)
        System.out.println("Test 3: " + sol.wordPattern("aaaa", "dog cat cat dog"));   // false

        // Test 4 → false (a aur b dono dog se map nahi ho sakte)
        System.out.println("Test 4: " + sol.wordPattern("abba", "dog dog dog dog"));   // false

        // Test 5 → true
        System.out.println("Test 5: " + sol.wordPattern("ab",   "dog cat"));           // true

        // Test 6 → false (length mismatch)
        System.out.println("Test 6: " + sol.wordPattern("abc",  "dog cat"));           // false
    }
}