package T006_recursion;
import java.util.*;
public class l001_print_decreasing {

    public static void print_decreasing(int n){
        if(n == 0)
            return;
        System.out.println(n);
        print_decreasing(n - 1);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        print_decreasing(n);
        scn.close();
    }
}
