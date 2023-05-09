package T008_recursion_in_arraylist;
import java.util.*;
public class l002_get_Keypad_Combination {

    static String [] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static ArrayList<String> getKPC(String str){

        if(str.length() == 0){
                ArrayList<String> base = new ArrayList<>();
                base.add("");
                return base;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);

        ArrayList<String> recAns = getKPC(ros);
        ArrayList<String> myAns = new ArrayList<>();

        int idx = ch - '0';
        String code = codes[idx];
        for(int i = 0 ; i < code.length(); i++){
            char newChar = code.charAt(i);

            for(String ele: recAns){
                myAns.add(newChar + ele);
            }
        }
        return myAns;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println(getKPC(str));
        scn.close();
    }
}
