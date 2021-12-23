import java.util.Scanner;
public class l003_printIncreasingDecreasing {
    public static void printDecreasingIncreasing(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printDecreasingIncreasing(n - 1);
        System.out.println(n);
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printDecreasingIncreasing(n);
        scn.close();
    }
}
