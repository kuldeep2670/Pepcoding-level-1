import java.util.Scanner;
public class l008_primeRange {
    public static boolean isPrime(int num){
        for(int i=2;i*i <= num; i++){
            if((num % i) == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a= scn.nextInt(), b = scn.nextInt();

        for(int i=a;i <= b; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
        scn.close(); 
    }
        
}
