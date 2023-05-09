package T003_Arrays;

import java.util.*;

public class l001_span_of_array {

    public static int span_of_array(int[] arr){
        int minimum = Integer.MAX_VALUE, maximum = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            minimum = Math.min(minimum, arr[i]);
            maximum = Math.max(maximum, arr[i]);
        }
        return(maximum - minimum);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int ans = span_of_array(arr);
        System.out.println("Maximum - Minimum: " + ans);
        scn.close();
    }

}
