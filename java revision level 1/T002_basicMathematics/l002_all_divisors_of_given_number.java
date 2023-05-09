package T002_basicMathematics;

import java.util.*;


public class l002_all_divisors_of_given_number {

    // first approach  O(n)
    static void divisors1(int n){
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }
    }

    // optimal approach O(sqrt(n))

    static void divisors2(int n){
        List<Integer> ls = new ArrayList<>();
        for(int i = 1; i <= (int) Math.sqrt(n); i++){ // i*i <= n  TC = O(sqrt(n))
            if(n % i == 0){
                ls.add(i);
                if(i != n/i)
                    ls.add(n/i);
            }
        }
        Collections.sort(ls);
        for(Integer ele: ls){
            System.out.print(ele + " ");
        }
    }


    public static void main(String[] args){
        int n = 36;
        // divisors1(n);
        divisors2(n);
    }
}
