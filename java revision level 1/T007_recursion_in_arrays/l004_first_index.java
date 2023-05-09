package T007_recursion_in_arrays;
import java.util.*;
public class l004_first_index {

    public static int first_index(int [] arr, int idx, int x){

        // if(idx == arr.length)
        //     return -1;

        // int fiisa = first_index(arr, idx + 1, x); // first index in smaller array
        // if(arr[idx] == x)
        //     return idx;
        // else
        //     return fiisa;


        if(idx == arr.length)
            return -1;

        if(arr[idx] == x)
            return idx;

        int fiisa = first_index(arr, idx + 1, x); // first index in smaller array
        return fiisa;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        int fi = first_index(arr, 0, x);
        System.out.println(fi);
        scn.close();
    }
}
