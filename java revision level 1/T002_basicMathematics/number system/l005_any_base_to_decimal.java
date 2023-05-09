

import java.util.*;

public class l005_any_base_to_decimal {
    public static int any_base_to_decimal(int n, int b) { // b> 1 b<= 10
        int ans = 0, pow = 1;
        while (n != 0) {
            int rem = n % 10;
            n /= 10;

            ans += rem * pow;
            pow = pow * b;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = any_base_to_decimal(n, b);
        System.out.println(dn);
        scn.close();
    }
}
