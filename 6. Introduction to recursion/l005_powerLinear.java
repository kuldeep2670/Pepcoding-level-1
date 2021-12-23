import java.util.Scanner;
public class l005_powerLinear {
    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        int pow = power(x, n - 1);
        int pow1 = x * pow;
        return pow1;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int ans = power(x, n);
        System.out.println(ans);
        scn.close();
    }
}
