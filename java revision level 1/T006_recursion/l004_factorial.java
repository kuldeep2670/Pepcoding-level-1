package T006_recursion;
import java.util.*;
public class l004_factorial {

    public static int factorial(int n){
        if(n == 0)
            return 1;
        int fact = n * factorial(n - 1);
        return fact;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int fact = factorial(n);
        System.out.println(fact);
        scn.close();
    }
}
