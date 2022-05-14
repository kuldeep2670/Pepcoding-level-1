// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
// determine if the input string is valid.
// An input string is valid if:
// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
// --->Example 1:
// Input: s = "()"
// Output: true
// --->Example 2:
// Input: s = "()[]{}"
// Output: true
// --->Example 3:
// Input: s = "(]"
// Output: false

// --->Constraints:
// 1 <= s.length <= 104
// s consists of parentheses only '()[]{}'.


import java.util.*;
public class l002_LC_20_Valid_Parenthsis {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        
        for(int i = 0;i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch =='{' || ch =='[' || ch == '('){
                st.push(ch);
            }
            else{
                if(st.size() == 0)   //for if only closing brackets are there
                    return false;
                if(ch == '}' && st.peek() !='{')
                    return false;
                else if(ch ==']' && st.peek() != '[')
                    return false;
                else if(ch ==')' && st.peek() != '(')
                    return false;
                else{
                    st.pop();
                }
            }
        }
        return st.size() == 0;
        // if(st.size() == 0)
        //     return true;
        // else
        //     return false;
    }
}
