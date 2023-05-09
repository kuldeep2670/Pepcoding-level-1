package T009_recursion_on_the_way_up;
import java.util.*;
public class l001_print_Subsequence {

    public static void printSubSequence(String str, String ans){

        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);

        printSubSequence(ros, ans + ch);
        printSubSequence(ros, ans);

    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        printSubSequence(str, "");
        scn.close();

    }
}
