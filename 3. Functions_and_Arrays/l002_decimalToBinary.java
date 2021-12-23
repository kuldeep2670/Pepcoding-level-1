import java.util.Scanner;
public class l002_decimalToBinary {
    public static int decimalToBinary(int n){
        int ans=0, pow = 1, rem;
        while(n != 0){
            rem = n % 2;
            n /= 2;
            ans += rem * pow;
            pow = pow * 10; 
        }
        return ans;
    }
    public static int binaryToDecimal(int n){
        int ans=0, pow = 1, rem;
        while(n != 0){
            rem = n % 10;
            n /= 10;
            ans += rem * pow;
            pow *= 2; 
        }
        return ans;
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int binary = decimalToBinary(n);
        int decimal = binaryToDecimal(binary);
        System.out.println(binary);
        System.out.println(decimal);
        scn.close();
    }
}
