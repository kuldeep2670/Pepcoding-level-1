package T006_recursion;
import java.util.*;

public class l005_power_linear {

    public static int power_linear(int x, int n){
        if(n == 0)
            return 1;
        int pow = x * power_linear(x, n - 1);
        return pow;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int ans = power_linear(x, n);
        System.out.println(ans);
        scn.close();
    }
}
