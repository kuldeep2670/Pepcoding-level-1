import java.util.*;
public class l003_climbstairsWithVariableJumps {
    public static int solve(int [] arr, int src, int dest){
        if(src == dest){
            return 1;
        }
        int count = 0;
        for(int jump = 1; jump <= arr[src] && jump + src <= dest; jump++){
            count += solve(arr, src + jump, dest);
        }
        return count;
    }
    public static int solveM(int [] arr, int src, int dest, int [] dp){
        if(src == dest){
            return dp[src] = 1;
        }
        if(dp[src] != 0){
            return dp[src];
        }
        int count = 0;
        for(int jump = 1; jump <= arr[src] && jump + src <= dest; jump++){
            count += solveM(arr, src + jump, dest, dp);
        }
        return dp[src] = count;
    }
    public static int solveT(int [] arr, int SRC, int dest, int [] dp){
        for(int src = dp.length -1; src >= SRC; src--){
            if(src == dest){
                dp[src] = 1;
                continue;
            }
            
            int count = 0;
            for(int jump = 1; jump <= arr[src] && jump + src <= dest; jump++){
                count += dp[src + jump];
            }
            dp[src] = count;
        }
        
        return dp[SRC];
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i =0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        int [] dp = new int[n + 1];
        // int ans = solve(arr, 0, n);
        int ans = solveT(arr, 0, n, dp);
        System.out.println(ans);
        scn.close();
    }
}
