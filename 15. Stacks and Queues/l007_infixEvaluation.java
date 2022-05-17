// 1. You are given an infix expression.
// 2. You are required to evaluate and print it's value.

// Constraints
// 1. Expression is balanced
// 2. The only operators used are +, -, *, /
// 3. Opening and closing brackets - () - are used to impact precedence of operations
// 4. + and - have equal precedence which is less than * and /. * and / also have equal precedence.
// 5. In two operators of equal precedence give preference to the one on left.
// 6. All operands are single digit numbers.

// Format
// Input
// Input is managed for you 

// Output
// Value of infix expression

// Example
// Sample Input

// 2 + 6 * 4 / 8 - 3

// Sample Output
// 2

import java.util.*;
import java.io.*;

public class l007_infixEvaluation {

    public static int precedence(char opr) {
        if (opr == '+' || opr == '-')
            return 1;
        return 2;
    }

    public static boolean isOptr(char ch) {
        if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
            return true;
        }
        return false;
    }

    public static int calVal(int a, int b, char optr) {
        if (optr == '+') {
            return a + b;
        } else if (optr == '-') {
            return a - b;
        } else if (optr == '*') {
            return a * b;
        } else if (optr == '/') {
            return a / b;
        }
        return 0;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        Stack<Character> operator = new Stack<>();
        Stack<Integer> operand = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch == '(') {
                operator.push(ch);
            } else if (ch >= '0' && ch <= '9') {
                operand.push(ch - '0');
            } else if (ch == ')') {

                while (operator.peek() != '(') {
                    char optr = operator.pop(); // +-x/
                    int v2 = operand.pop();
                    int v1 = operand.pop();
                    int ans = calVal(v1, v2, optr);
                    operand.push(ans);
                }
                operator.pop();
            } else if (isOptr(ch)) {
                while (operator.size() > 0 && operator.peek() != '(' && precedence(ch) <= precedence(operator.peek())) {
                    char optr = operator.pop(); // +-x/
                    int v2 = operand.pop();
                    int v1 = operand.pop();
                    int ans = calVal(v1, v2, optr);
                    operand.push(ans);
                }
                operator.push(ch);
            }
        }

        while (operator.size() != 0) {
            char optr = operator.pop(); // +-x/
            int v2 = operand.pop();
            int v1 = operand.pop();
            int ans = calVal(v1, v2, optr);
            operand.push(ans);
        }

        System.out.println(operand.peek());

    }
}
