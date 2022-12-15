import java.util.Scanner;
public class l013_inverseOfNumberLeftToRight {
    public static int countDigits(int n){
        int count=0;
        while(n!=0){
            n/=10;
            count++;
        }
        return count;
    }
    public static void inverseNumber(int num){
        int len = countDigits(num);
        int lastIndex = len, res = 0;
        while(num != 0){
            int lastDigit = num % 10;
            num = num / 10;

            res = res + (lastIndex * (int)Math.pow(10, len - lastDigit));
            lastIndex--;
        }
        System.out.println(res);
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        inverseNumber(num);
        scn.close(); 
    }
}
