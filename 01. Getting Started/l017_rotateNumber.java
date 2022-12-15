import java.util.Scanner;
public class l017_rotateNumber {
    public static int countDigits(int n){
        int count=0;
        while(n!=0){
            n/=10;
            count++;
        }
        return count;
    }
    public static int rotateNumber(int num, int r){
        int len = countDigits(num);
        r = (r % len + len) % len;
        int a = num / (int) Math.pow(10,r);
        int b = num % (int) Math.pow(10,r);
        
        return (b * (int) Math.pow(10, len-r) + a);
    }
    public static int rotateNumber2(int num, int r){
        int len = countDigits(num);
        r = (r % len + len) % len;
        int div = 1, mul = 1;
        for(int i = 1; i <= len; i++){
            if(i <= r){
                div *= 10;
            }else{
                mul *= 10;
            }
        } 
        int a = num / div;
        int b = num % div;

        return(b * mul + a);
    }
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        int num= scn.nextInt() , r = scn.nextInt();;
        int ans=rotateNumber2(num,r);
        System.out.println(ans);
        scn.close(); 
    }
}
