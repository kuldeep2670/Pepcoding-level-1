import java.util.*;;
public class l009_decimal_subtraction {

    public static int decimal_subtraction(int n1, int n2){ // n2 > n1
        int ans = 0, pow = 1, borrow = 0;
        while(n2 != 0){
            int sub = borrow + n2 % 10 - n1 % 10;
            n1 = n1 / 10;
            n2 = n2 / 10;
            if(sub < 0){
                sub = sub + 10; 

                // any base subtraction
                // sub = sub + b;

                borrow = -1;
            }else{
                borrow = 0;
            }
            ans = ans + sub * pow;
            pow = pow * 10;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt() , n2 = scn.nextInt();
        int ans = decimal_subtraction(n1, n2);
        System.out.println(ans);
        scn.close();
    }
}
