import java.util.Scanner;

public class LengthOfLastWord58 {

    public static int lengthOfLastWord(String s) {

        int i = s.length() - 1;

        // Last ke spaces skip karo
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        int count = 0;

        // Last word count karo
        while (i >= 0 && s.charAt(i) != ' ') {
            count++;
            i--;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String s = sc.nextLine();

        int ans = lengthOfLastWord(s);

        System.out.println("Length of Last Word = " + ans);

        sc.close();
    }
}
