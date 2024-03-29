

import java.util.*;
public class l001_digit_Frequency {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
        scn.close();
    }

    public static int getDigitFrequency(int n, int d) {
        int digit, count = 0;
        while(n != 0){
            digit = n % 10;
            if(digit == d){
                count++;
            }
            n = n / 10;
        }
        return count;
    }
}
