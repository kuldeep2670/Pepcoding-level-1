package T008_recursion_in_arraylist;
import java.util.*;;
public class l001_get_Subsequence {

    public static ArrayList<String> getSubsequence(String str){

        if(str.length() == 0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        
        char ch = str.charAt(0); // a
        String ros = str.substring(1); // bc

        ArrayList<String> recAns = getSubsequence(ros);

        ArrayList<String> myAns = new ArrayList<>();

        for(String ele : recAns)
            myAns.add(ele);
        for(String ele : recAns)
            myAns.add(ch + ele);

        return myAns;

    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        ArrayList<String> res = getSubsequence(str);
        System.out.println(res);
        scn.close();
    }
}
