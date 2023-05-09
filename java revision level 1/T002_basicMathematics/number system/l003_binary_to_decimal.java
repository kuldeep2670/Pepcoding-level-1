

import java.util.*;
public class l003_binary_to_decimal {
    public static int binary_to_decimal(int n){
        int ans = 0, pow = 1;
        while(n != 0){
            int rem = n % 10;
            n /= 10;

            ans += rem * pow;
            pow = pow * 2;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = binary_to_decimal(n);
        System.out.println(ans);
        scn.close();
    }
}
