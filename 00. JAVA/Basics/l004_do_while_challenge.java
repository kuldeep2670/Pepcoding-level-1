package Basics;
public class l004_do_while_challenge {
    public static void main(String[] args){
        int n= 12345;
        int rem, sum = 0;

        do{
            rem = n % 10;
            n = n / 10;
            sum = sum + rem;
        }while(n != 0);

        System.out.println(sum);
    }
}
