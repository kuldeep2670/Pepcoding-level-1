package T005_String_Stringbuilder_arraylist;
import java.util.*;
public class l006_string_with_difference {

    public static String string_difference(String str){
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        int diff;
        char prev, curr;
        for(int i = 1; i < str.length(); i++){
            curr = str.charAt(i);
            prev = str.charAt(i - 1);

            diff = curr - prev;
            sb.append(diff);
            sb.append(curr);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(string_difference(str));
        scn.close();
    }
}
