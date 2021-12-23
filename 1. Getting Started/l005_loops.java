import java.util.Scanner;
public class l005_loops {
    public static void main(String[] args) {
        /*int tableNumber = 12;
        for(int num = 1; num <= 10; num++) {
            System.out.println(tableNumber + " X " + num + " = " + tableNumber * num);
        }*/
        Scanner scn = new Scanner(System.in);
        boolean isPrime = true;
        int num = scn.nextInt();
        for(int i = 2; i < num; i++){
            if((num % i) == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println(num + " is Prime");
        }else{
            System.out.println(num + " is not Prime");
        }
        scn.close();
    }
}
