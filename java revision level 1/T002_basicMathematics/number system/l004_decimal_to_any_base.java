

import java.util.*;

public class l004_decimal_to_any_base {

    public static int decimal_to_any_base(int n, int b){ // b> 1 b<= 10
        int ans = 0, pow = 1;
        while(n != 0){
            int rem = n % b;
            n /= b;

            ans += rem * pow;
            pow = pow * 10;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = decimal_to_any_base(n, b);
        System.out.println(dn);
        scn.close();
    }
}
