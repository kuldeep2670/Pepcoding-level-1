package T009_recursion_on_the_way_up;
import java.util.*;
public class l006_print_Permutations {

    public static void printPermutations(String str, String asf){

        if(str.length() == 0){
            System.out.println(asf);
            return;
        }

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1);

            printPermutations(ros, asf + ch);
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        printPermutations(str, "");
        scn.close();
    }
}
