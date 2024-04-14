import java.util.*;

public class Balanced_Brackets {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string containing brackets: ");
        String s = scanner.nextLine();
        Stack<Character> st = new Stack<>();
        boolean isBalanced = true;
        for (char c : s.toCharArray()) {
            if (c == '{') st.push('}');
            else if (c == '[') st.push(']');
            else if (c == '(') st.push(')');
            else if (st.isEmpty() || st.pop() != c) {
                isBalanced = false;
                break;
            }
        }

        if (st.isEmpty() && isBalanced) {
            System.out.println("The string is balanced.");
        } else {
            System.out.println("The string is not balanced.");
        }
    }
}
