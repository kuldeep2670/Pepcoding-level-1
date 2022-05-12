import java.util.Scanner;
public class l018_GCD_LCM {

    public static void GCD_LCM(int num1, int num2){
        int a= num1, b=num2,rem, gcd, lcm;
        while(num1%num2!=0){
            rem = num1%num2;
            num1 = num2;
            num2 = rem;
        }
        gcd =num2;
        lcm = (a *b)/gcd;
        System.out.println(gcd);
        System.out.println(lcm);
    }
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        int num1= scn.nextInt() , num2= scn.nextInt();
        GCD_LCM(num1, num2);
        scn.close(); 
    }
}
