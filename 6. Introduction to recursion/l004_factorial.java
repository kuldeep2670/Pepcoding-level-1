import java.util.Scanner;
public class l004_factorial {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = factorial(n);
        System.out.println(ans);
        scn.close();
    }

    public static int factorial(int n){
        if(n == 0){
            return 1;
        }
        int recAns = factorial(n - 1);
        int myAns = n * recAns;
        return myAns;
        
    }
    // public static int factorial(int n){
    //     if(n == 0){
    //         return 1;
    //     }
    //     return n*factorial(n - 1);
        
    // }

    // public static int factorial(int n){
    //     return (n == 0) ? 1 : n*factorial(n - 1);
        
    // }
}
