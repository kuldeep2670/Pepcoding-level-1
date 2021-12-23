import java.util.Scanner;
public class l001_digitFrequency {
    public static int getDigitFrequency(int n, int d) {
        int ocr = 0, ld;
        while(n != 0){
            ld = n % 10;
            n /= 10;
            if(ld == d)
                ocr++;
        }
        return ocr;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
        scn.close();
    }
}
