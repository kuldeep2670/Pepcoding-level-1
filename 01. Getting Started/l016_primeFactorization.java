import java.util.Scanner;
public class l016_primeFactorization {
    public static void main(String args[]){
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ::");
        number = sc.nextInt();
       
        for(int i = 2; i< number; i++) {
           while(number%i == 0) {
              System.out.print(i+" ");
              number = number/i;
            //   System.out.println(number);
           }
        }
        if(number != 1) {
            System.out.println(number);
         }
         sc.close(); 
     }
}
