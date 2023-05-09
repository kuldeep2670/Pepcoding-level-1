package T006_recursion;
import java.util.*;
public class l002_print_increasing {

    public static void print_increasing(int n){

        if(n == 0)
            return;
        print_increasing(n - 1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        print_increasing(n);
        scn.close();
    }
}
