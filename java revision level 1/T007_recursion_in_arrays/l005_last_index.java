package T007_recursion_in_arrays;
import java.util.*;
public class l005_last_index {

    public static int last_index(int [] arr, int idx, int x){

        if(idx == arr.length)
            return -1;
        int li = last_index(arr, idx + 1, x);
        if(li == -1){
            if(arr[idx] == x)
                return idx;
            else
                return li;
        }else{
            return li;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        int li = last_index(arr, 0, x);
        System.out.println(li);
        scn.close();
    }
}
