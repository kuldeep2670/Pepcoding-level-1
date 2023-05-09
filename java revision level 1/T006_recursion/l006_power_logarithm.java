package T006_recursion;
import java.util.*;
public class l006_power_logarithm {

    public static int power_log(int x, int n){

        if(n == 0)
            return 1;
        
        int recAns = power_log(x, n/2);
        int ans = recAns * recAns;

        if(n % 2 != 0)
            ans *= x;

        return ans;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int xn = power_log(x, n);
        System.out.println(xn);
        scn.close();
    }
}
