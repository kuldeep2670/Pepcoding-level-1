import java.util.*;
public class l008_binary_addition {
    public static int decimal_addition(int n, int m){
        int ans = 0, pow = 1, carry = 0;
        while(n != 0 || m != 0 || carry !=0){
            int sum = carry + n % 10 + m % 10;
            n /= 10;
            m /= 10;
            carry = sum / 2;
            sum = sum % 2;

            // any base addition
            // carry = sum / b;
            // sum = sum % b;

            ans = ans + sum * pow;
            pow = pow * 10;
        }
        return ans;

    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt() , n2 = scn.nextInt();
        int ans = decimal_addition(n1, n2);
        System.out.println(ans);
        scn.close();
    }
}
