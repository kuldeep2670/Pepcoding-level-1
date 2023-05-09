package T005_String_Stringbuilder_arraylist;
import java.util.*;
public class l004_toggle_case_string {
    public static String toggleCase(String str){
        String ans = "";
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                // char upper = (char)(str.charAt(i) - 'a' + 'A');
                char upper = (char)(str.charAt(i) - 32);
                ans += upper;
            }else if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                // char lower = (char)(str.charAt(i) - 'A' + 'a');
                char lower = (char)(str.charAt(i) + 32);
                ans += lower;
            }else{
                ans += str.charAt(i);
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(toggleCase(str));
        
        scn.close();
    } 
}
