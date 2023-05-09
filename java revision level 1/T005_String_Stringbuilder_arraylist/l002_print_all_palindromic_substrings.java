package T005_String_Stringbuilder_arraylist;
import java.util.*;
public class l002_print_all_palindromic_substrings {

    public static boolean palindrome(String str){
        int n = str.length() - 1;

        for(int i = 0 ; i <= n / 2; i++){
            if(str.charAt(i) != str.charAt(n - i)){
                return false;
            }
        }
        return true;
    }

    public static void palindromic_substring(String str){
        for(int i = 0; i < str.length(); i++){
            for(int j = i; j < str.length(); j++){

                String subString = str.substring(i, j + 1);
                if(palindrome(subString) == true){
                    System.out.println(subString);
                }

            }
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        palindromic_substring(str);
        scn.close();
    }
}
