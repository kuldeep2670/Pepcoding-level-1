import java.util.Scanner;
public class l012_printFibonacci {
    public static void fibonacci(int n){
        int a=0, b = 1, c;
        for( int i = 0; i < n; i++){
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        fibonacci(n);
        scn.close();
    }
}
