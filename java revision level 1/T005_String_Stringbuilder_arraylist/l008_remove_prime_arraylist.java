package T005_String_Stringbuilder_arraylist;
import java.util.*;
public class l008_remove_prime_arraylist {

    public static boolean isPrime(int n){
        for(int i = 2; i * i <= n; i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }

    public static void remove_prime(ArrayList<Integer> al){
        for(int i = 0; i < al.size(); i++){
            if(isPrime(al.get(i)))
                al.remove(i);
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0; i < n; i++){
            al.add(scn.nextInt());
        }

        remove_prime(al);
        System.out.println(al);
        scn.close();
    }
}
