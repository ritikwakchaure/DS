public class StringCompression443 {

    public int compress(char[] chars) {
        int n = chars.length;
        int i = 0;
        int index = 0;

        while (i < n) {
            int count = 0;
            char curr_char = chars[i];

            while (i < n && chars[i] == curr_char) {
                i++;
                count++;
            }

            chars[index++] = curr_char;

            if (count > 1) {
                String countchar = Integer.toString(count);

                for (char ch : countchar.toCharArray()) {
                    chars[index++] = ch;
                }
            }
        }

        return index;
    }

    public class Main {
        public static void main(String[] args) {

            StringCompression443 sol = new StringCompression443();

            char[] chars = { 'a', 'a', 'b', 'b', 'c', 'c', 'c' };

            int len = sol.compress(chars);

            System.out.println("Length: " + len);

            System.out.print("Compressed Array: ");
            for (int i = 0; i < len; i++) {
                System.out.print(chars[i]);
            }
        }
    }

}