import java.util.*;
public class l010_multiplication {

    public static int multiply_digit(int n, int digit, int b){
        int ans = 0, pow = 1, carry = 0;
        while(n != 0 || carry != 0){
            int mul = carry + (n % 10) * digit;
            n = n / 10;
            
            carry = mul / b;
            mul = mul % b;

            ans = ans + mul * pow;
            pow = pow * 10;
        }
        return ans;
    }

    public static int anyBaseAddition(int n1, int n2, int b){
        int ans = 0, carry = 0, pow = 1;
        while(n1 != 0 || n2 != 0 || carry != 0){
            int sum = carry + n1 % 10 + n2 % 10;
            n1 = n1 / 10;
            n2 = n2 / 10;

            carry = sum / b;
            sum = sum % b;

            ans = ans + sum * pow;
            pow = pow * 10;
        }
        return ans;
    }

    public static int multiply_number(int n1, int n2, int b){
        int ans = 0, pow = 1, digitmultiply;
        while(n2 != 0){
            digitmultiply = multiply_digit(n1, n2 % 10, b);
            n2 = n2 / 10;

            ans = anyBaseAddition(ans, digitmultiply * pow, b);
            pow = pow * 10;
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int b = scn.nextInt();

        int ans = multiply_number(n1, n2, b);
        System.out.println("Multiplication : " + ans);
        scn.close();

    }
}
