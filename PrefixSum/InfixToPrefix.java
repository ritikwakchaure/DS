
import java.util.Scanner;

public class InfixToPrefix {

    static int precedence(char op) {
        if (op == '^') return 3;
        if (op == '*' || op == '/') return 2;
        if (op == '+' || op == '-') return 1;
        return 0;
    }

    static String reverseAndSwap(String expr) {
        StringBuilder sb = new StringBuilder();
        for (int i = expr.length() - 1; i >= 0; i--) {
            char ch = expr.charAt(i);
            if      (ch == '(') sb.append(')');
            else if (ch == ')') sb.append('(');
            else                sb.append(ch);
        }
        return sb.toString();
    }

    static String toPostfix(String expr) {
        java.util.Stack<Character> s = new java.util.Stack<>();
        StringBuilder result = new StringBuilder();
        for (char ch : expr.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                result.append(ch);
            } else if (ch == '(') {
                s.push(ch);
            } else if (ch == ')') {
                while (!s.isEmpty() && s.peek() != '(')
                    result.append(s.pop());
                s.pop();
            } else {
                while (!s.isEmpty() && precedence(ch) < precedence(s.peek()))
                    result.append(s.pop());
                s.push(ch);
            }
        }
        while (!s.isEmpty()) result.append(s.pop());
        return result.toString();
    }

    static String infixToPrefix(String infix) {
        String reversed = reverseAndSwap(infix);
        String postfix  = toPostfix(reversed);
        return new StringBuilder(postfix).reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n─────────────────────");
            System.out.println("1. Letters (A+B*C)");
            System.out.println("2. Numbers (3+5*2)");  // ✅ NUMBER INPUT
            System.out.println("0. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter infix (letters): ");
                String infix = sc.next();
                System.out.println("Prefix : " + infixToPrefix(infix));

            } else if (choice == 2) {

                // ✅ NUMBER INPUT FROM USER
                System.out.print("Enter first number  : ");
                int a = sc.nextInt();

                System.out.print("Enter operator (+,-,*,/,^): ");
                char op1 = sc.next().charAt(0);

                System.out.print("Enter second number : ");
                int b = sc.nextInt();

                System.out.print("Enter operator (+,-,*,/,^) [or = to stop]: ");
                char op2 = sc.next().charAt(0);

                if (op2 == '=') {
                    // single operator: a op b
                    String infix = a + "" + op1 + b;
                    System.out.println("Infix  : " + infix);
                    System.out.println("Prefix : " + op1 + a + b);

                } else {
                    System.out.print("Enter third number  : ");
                    int c = sc.nextInt();

                    // build infix string  e.g. "3+5*2"
                    String infix = a + "" + op1 + b + "" + op2 + c;
                    System.out.println("\nInfix  : " + infix);
                    System.out.println("Prefix : " + infixToPrefix(infix));
                }
            }

        } while (choice != 0);

        sc.close();
    }
}