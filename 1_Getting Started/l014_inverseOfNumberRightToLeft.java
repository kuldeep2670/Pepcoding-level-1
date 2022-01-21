import java.util.Scanner;
public class l014_inverseOfNumberRightToLeft {
    public static void inverseNumber(int num){
        int lastIndex = 1, res = 0;
        while (num != 0) {
            int lastDigit = num % 10;
            num /= 10;

            res += lastIndex * (int) Math.pow(10, lastDigit - 1);
            lastIndex++;
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
