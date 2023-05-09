package T006_recursion;
import java.util.*;
public class l003_print_decreasing_increasing {

    public static void print_decreasing_increasing(int n){
        if(n == 0)
            return;
        System.out.println(n);
        print_decreasing_increasing(n - 1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        print_decreasing_increasing(n);
        scn.close();
    }
}
