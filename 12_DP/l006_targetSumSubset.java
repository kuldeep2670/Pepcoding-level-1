import java.util.Scanner;
public class l006_targetSumSubset {
    public static boolean tarSumSS(int [] arr, boolean [][] dp){
        int n = dp.length;
        int m = dp[0].length;
        
        // travel in dp
        for(int i = 0; i < n; i++){
            for(int j = 0; j<m; j++){
                if(j == 0){
                    dp[i][j] = true; // zeroth column in dp is true
                }
                else if( i == 0 ){ // zeroth row in dp is false except first element of zeroth row
                    dp[i][j] = false;
                }
                else{
                    boolean noCall = dp[i-1][j];
                    
                    boolean yesCall = false;
                    
                    if(j - arr[i-1] >= 0){
                        yesCall = dp[i-1][j-arr[i-1]];
                    }
                    dp[i][j] = noCall || yesCall;
                }
                
            }
            
        }
        return dp[n-1][m-1];
    }

    public static boolean solve(int idx, int tar, int [] arr){ //using recursion
        if(idx == arr.length || tar == 0){
            if(tar == 0){
                return true;
            }
            return false;
        }
        
        boolean no = solve(idx + 1, tar, arr);
        boolean yes = false;
        if(tar - arr[idx] >= 0){
            yes = solve(idx + 1, tar - arr[idx], arr);
        }
        return yes || no;
    }

    

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<n; i++)
            arr[i] = scn.nextInt();
        int tar = scn.nextInt();
        
        // boolean [][] dp = new boolean[n+1][tar+1];
        // boolean ans = tarSumSS(arr,dp);  //tabulation


        boolean ans = solve(0, tar, arr);
        System.out.println(ans);
        scn.close();
    }
}
