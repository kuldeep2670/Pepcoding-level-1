

import java.util.*;

public class l006_any_base_to_any_base {

    public static int anyBaseToDecimal(int n, int b) {
        int ans = 0, pow = 1, rem;
        while (n != 0) {
            rem = n % 10;
            n /= 10;
            ans += rem * pow;
            pow = pow * b;
        }
        return ans;
    }

    public static int decimalToAnyBase(int n, int b) {
        int ans = 0, pow = 1, rem;
        while (n != 0) {
            rem = n % b;
            n /= b;
            ans += rem * pow;
            pow = pow * 10;
        }
        return ans;
    }

    public static int any_base_to_any_base(int n, int b1, int b2){
        int decimal = anyBaseToDecimal(n, b1);
        int ans = decimalToAnyBase(decimal, b2);
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
       int  destBase= scn.nextInt();
       int ans = any_base_to_any_base(n, sourceBase, destBase);
       System.out.println(ans);
       scn.close();
     }  
}
