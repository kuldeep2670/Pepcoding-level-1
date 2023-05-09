package T004_2d_array;
import java.util.*;
public class l009_saddle_point {

    public static int saddle_point(int[][] arr){
        
        for(int i = 0 ; i < arr.length ; i++){
            int svj = 0;

            for(int j = 1; j < arr[0].length; j++){
                if(arr[i][j] < arr[i][svj]){
                    svj = j;
                }
            }

            boolean flag = true;

            for(int k = 0; k < arr.length; k++){
                if(arr[k][svj] > arr[i][svj]){
                    flag = false;
                    break;
                }
            }

            if(flag == true){
                return arr[i][svj];
            }
        }
        return -1;

    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n ; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        int sp = saddle_point(arr);
        System.out.println("saddle point: " + sp);
        scn.close();
    }
}
