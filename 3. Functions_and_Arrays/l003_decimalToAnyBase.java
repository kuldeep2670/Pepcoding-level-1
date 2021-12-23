import java.util.Scanner;
public class l003_decimalToAnyBase {
    public static int decimalToAnyBase(int n, int b){
        int ans=0, pow = 1, rem;
        while(n != 0){
            rem = n % b;
            n /= b;
            ans += rem * pow;
            pow = pow * 10; 
        }
        return ans;
    }

    public static int anyBaseToDecimal(int n, int b){
        int ans=0, pow = 1, rem;
        while(n != 0){
            rem = n % 10;
            n /= 10;
            ans += rem * pow;
            pow = pow * b; 
        }
        return ans;
    }
    public static int anyBaseToAnyBase(int n, int b1, int b2){
        int decimal = anyBaseToDecimal(n, b1);
        int ans = decimalToAnyBase(decimal, b2);
        return ans;
    }

    public static int decimalAddition(int n, int m){
        int ans = 0, pow = 1, carry =0;
        while(n != 0 || m != 0 || carry != 0){
            int sum = carry + n % 10 + m % 10 ;
            n /= 10;
            m /= 10;
            carry = sum / 10;
            sum %= 10;
            ans += sum * pow;
            pow *= 10; 

        }
        return ans;
    }
    public static int anyBaseAddition(int b, int n1,int n2){
        int ans = 0, pow = 1, carry =0;
        while(n1 != 0 || n2 != 0 || carry != 0){
            int sum = carry + n1 % 10 + n2 % 10 ;
            n1 /= 10;
            n2 /= 10;
            carry = sum / b;
            sum %= b;
            ans += sum * pow;
            pow *= 10; 

        }
        return ans;

    }

    public static int decimalSubtraction(int n1, int n2){
        int ans = 0, borrow = 0, pow = 1;
        while(n2 != 0){
            int sub = borrow + n2 % 10 - n1 % 10;
            n1 /= 10;
            n2 /= 10;
             if(sub < 0){
                 sub += 10;
                 borrow = -1;

             } else{
                 borrow = 0;
             }

            ans += sub * pow;
            pow *= 10;
        }
        return ans;
    }

    public static int anyBaseSubtraction(int b, int n1, int n2){
        int ans = 0, borrow = 0, pow = 1;
        while(n2 != 0){
            int sub = borrow + n2 % 10 - n1 % 10;
            n1 /= 10;
            n2 /= 10;
             if(sub < 0){
                 sub += b;
                 borrow = -1;

             } else{
                 borrow = 0;
             }

            ans += sub * pow;
            pow *= 10;
        }
        return ans;
    }

    public static int multiplyDigitWithNumber(int n, int digit, int base){
        int ans =0, carry =0, pow = 1;
        while(n != 0 || carry != 0){
            int mul = carry + (n % 10) * digit;
            n /= 10;

            carry = mul / base;
            mul %= base;
            ans += mul * pow;
            pow *= 10;
        }
        return ans;  
    }
    public static int getProduct( int b, int n1, int n2){
        int ans=0, pow= 1;
        while(n2 != 0){
            int digirMultiply = multiplyDigitWithNumber(n1, n2 % 10, b);
            n2 /= 10;

            ans = anyBaseAddition(b, ans, digirMultiply * pow);
            pow *= 10;

        }
        return ans;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt() , n2 = scn.nextInt();
        int ans = decimalSubtraction(n1, n2);
        System.out.println(ans);
        scn.close();
    }
}
 