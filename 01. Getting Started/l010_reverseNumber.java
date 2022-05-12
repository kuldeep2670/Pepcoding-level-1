import java.util.Scanner;
public class l010_reverseNumber {
    public static void reverseNumber(int n){
        
        while(n!=0){
            int digit=n%10;
            System.out.println(digit);
            n /=10;
            

        }
        
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        reverseNumber(num);
        scn.close(); 
    }
    
}
