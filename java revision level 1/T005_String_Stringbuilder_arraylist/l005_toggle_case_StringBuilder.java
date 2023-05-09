package T005_String_Stringbuilder_arraylist;
import java.util.*;
public class l005_toggle_case_StringBuilder {

    public static String toggle_case(String str){
        StringBuilder ans = new StringBuilder(str);
        
        for(int i = 0; i < ans.length(); i++){
            char ch = ans.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                ans.setCharAt(i, ((char) (ch - 32)));
            }
            if(ch >= 'A' && ch <= 'Z'){
                ans.setCharAt(i, ((char) (ch + 32)));
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(toggle_case(str));
        scn.close();
    }
}
