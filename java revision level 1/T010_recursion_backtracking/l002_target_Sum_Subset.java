package T010_recursion_backtracking;
import java.util.*;
public class l002_target_Sum_Subset {

    public static void printTargetSumSubsets(int[] arr, int idx, String asf, int sum, int tar){

        if(idx == arr.length){
            if(sum == tar){
                System.out.println(asf);
            }
            return;
        }
        printTargetSumSubsets(arr, idx + 1, asf + arr[idx] + ", ", sum + arr[idx], tar);

        printTargetSumSubsets(arr, idx + 1, asf, sum, tar);
    }
    public static void main(String[] args){
        Scanner scn =  new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }

        int tar = scn.nextInt();
        printTargetSumSubsets(arr, 0, "", 0, tar);
        scn.close();
    }
}
