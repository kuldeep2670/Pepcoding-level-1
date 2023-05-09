package T007_recursion_in_arrays;
import java.util.*;
public class l003_max_in_array {
    public static int max_in_arr(int[] arr, int idx){

        if(idx == arr.length - 1)
            return arr[idx];

        int recArr = max_in_arr(arr, idx + 1);
        if(recArr > arr[idx])
            return recArr;
        else
            return arr[idx];
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = scn.nextInt();
        }
        int max = max_in_arr(arr, 0);
        System.out.println(max);
        scn.close();
    }
}
