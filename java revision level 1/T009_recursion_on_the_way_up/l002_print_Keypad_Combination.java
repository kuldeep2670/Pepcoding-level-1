package T009_recursion_on_the_way_up;
import java.util.*;
public class l002_print_Keypad_Combination {
    static String [] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void printKeypadCombination(String str, String ans){

        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);

        String codeForCh = codes[ch - '0'];
        for(int i = 0; i < codeForCh.length(); i++){
            char chOption = codeForCh.charAt(i);
            printKeypadCombination(ros, ans + chOption);
        }
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        printKeypadCombination(str, "");
        scn.close();
    }
}
