import java.util.Scanner;
public class l006_powerLogarithmic {
    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        int recAns = power(x, n / 2);
        int ans = recAns * recAns;
        if(n % 2 != 0){
            ans *= x;
        }
        return ans;
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
