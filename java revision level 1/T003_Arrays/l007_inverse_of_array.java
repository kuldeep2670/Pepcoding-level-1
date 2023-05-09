package T003_Arrays;
import java.util.*;
public class l007_inverse_of_array {

    public static int[] inverse_array(int [] a){
        int [] ans = new int[a.length];

        for( int i = 0; i < a.length; i++){
            int temp = a[i];
            ans[temp] = i;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }

        int [] ans = inverse_array(arr);
        
        for(int i = 0; i < n; i++)
            System.out.print(ans[i] + " ");

        scn.close();
    }
}
