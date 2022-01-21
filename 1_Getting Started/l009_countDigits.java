import java.util.Scanner;
public class l009_countDigits {
    public static int countDigits(int n){
        int count=0;
        while(n!=0){
            n/=10;
            count++;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        int num= scn.nextInt();
        int digits=countDigits(num);
        System.out.println("No. of digits:" + digits);
        scn.close(); 
    }
    
}
