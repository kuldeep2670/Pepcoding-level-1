package T003_Arrays;
import java.util.*;
public class l008_subarray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++)
            arr[i] = scn.nextInt();
        
        for(int start = 0; start < n; start++){
            for(int end = start; end < n; end++){
                for(int k = start; k <= end; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
        scn.close();
    }
}
