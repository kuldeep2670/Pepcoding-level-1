import java.util.Scanner;
public class l011_displayDigits {
    public static int countDigits(int n){
        int count=0;
        while(n!=0){
            n/=10;
            count++;
        }
        return count;
    }
    public static void printDigits(int num){
        int len = countDigits(num) - 1;
        while(len >= 0){
            int digit = num / (int) Math.pow(10, len);
            num = num % (int) Math.pow(10, len);
            System.out.println(digit);
            len--;
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        printDigits(num);
        scn.close(); 
    }
}
