

import java.util.*;
public class l002_decimal_to_binary {

    public static int decimal_To_Binary(int n){
        int ans = 0, pow = 1;
        while(n != 0){
            int rem = n % 2;
            n /= 2;

            ans += rem * pow;
            pow = pow * 10;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = decimal_To_Binary(n);
        System.out.println(ans);
        scn.close();
    }
}
