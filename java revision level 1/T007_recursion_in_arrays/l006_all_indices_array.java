package T007_recursion_in_arrays;
import java.util.*;
public class l006_all_indices_array {

    public static int[] all_Indices(int[] arr, int x, int idx, int fsf){ // found so far

        if(idx == arr.length){
            return new int[fsf];
        }
        if(arr[idx] == x){
            int[] iarr = all_Indices(arr, x, idx + 1, fsf + 1);
            iarr[fsf] = idx;
            return iarr; 
        }else{
            int[] iarr = all_Indices(arr, x, idx + 1, fsf);
            return iarr;
        }
            
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = scn.nextInt();
        
        int x = scn.nextInt();

        int [] ans = all_Indices(arr, x, 0, 0);
        if(ans.length == 0){
            System.out.println("not found");
            scn.close();
            return;
        }

        for(int i = 0 ; i < ans.length; i++)
            System.out.print(ans[i] + " ");

        scn.close();
    }
}
