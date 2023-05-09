package T002_basicMathematics;
import java.util.Scanner;

public class l003_prime {

    public static boolean prime(int n){
        for(int i = 2; i * i < n; i++){
            if( n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        boolean ans = prime(n);
        if(n != 1 && ans == true){
            System.out.println(n + " is a prime number");
        }else{
            System.out.println(n + " is not a prime number");
        }
        scn.close();
    }
}
