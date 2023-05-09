package T007_recursion_in_arrays;
import java.util.*;
public class l001_display_array {

    public static void display_arr(int[] arr, int idx){

        if(idx == arr.length)
            return;

        System.out.print(arr[idx] + " ");
        display_arr(arr, idx + 1);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = scn.nextInt();
        }
        display_arr(arr, 0);
        scn.close();
    }
}
