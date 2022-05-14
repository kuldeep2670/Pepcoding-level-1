// 1. You are given a string exp representing an expression.
// 2. Assume that the expression is balanced  i.e. the opening and closing brackets match with each other.
// 3. But, some of the pair of brackets maybe extra/needless. 
// 4. You are required to print true if you detect extra brackets and false otherwise.

// e.g.'
// ((a + b) + (c + d)) -> false
// (a + b) + ((c + d)) -> true

// Input Format:
//       string str
// Output Format:
//       true or false
import java.util.*;

public class l003_duplicateBrackets {
    public static boolean duplicateBrackets(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ')') {
                st.push(ch);
            } else {
                if (st.peek() == '(') {
                    return true;
                }
                while (st.peek() != '(') {
                    st.pop();
                }
                st.pop();
            }

        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        boolean ans = duplicateBrackets(s);
        System.out.println(ans);
        scn.close();
    }
}
