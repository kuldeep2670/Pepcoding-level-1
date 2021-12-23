import java.util.Scanner;
public class l006_functions {

    public static Scanner scn = new Scanner(System.in);
   
    public static void printMul(){
        int a=20, b=30;
        System.out.println("Multiplication of two numbers: "+ (a*b));
    }

    public static int printLarge(){
        int a=23, b=30;
        if(a > b)
            return a;
        else
            return b;
    }

    public static void printFactorial(int n){
        int fact=1;
        for(int i=n;i>=1;i--){
            fact=fact*i;
        }
        System.out.println("Factorial: " + fact);

    }
    public static void main(String[] args) {
        printMul();
        int large=printLarge();
        System.out.println("Larger number is: " + large);
        int num = scn.nextInt();
        printFactorial(num);
    }
    
}
