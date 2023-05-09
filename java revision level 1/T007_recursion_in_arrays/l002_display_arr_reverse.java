package T007_recursion_in_arrays;
import java.util.*;
public class l002_display_arr_reverse {
    public static void display_arr_reverse(int[] arr, int idx){

        if(idx == arr.length)
            return;

            display_arr_reverse(arr, idx + 1);
            System.out.print(arr[idx] + " ");
        }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = scn.nextInt();
        }
        display_arr_reverse(arr, 0);
        scn.close();
    }
}
