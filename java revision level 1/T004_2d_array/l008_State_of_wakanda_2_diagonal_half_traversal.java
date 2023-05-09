package T004_2d_array;
import java.util.*;
public class l008_State_of_wakanda_2_diagonal_half_traversal {

    public static void state_of_wakanda_2(int[][] arr){
        int n = arr.length;
        for(int g = 0; g < n; g++){
            for(int i = 0, j = g; j < n; i++, j++){
                System.out.print(arr[i][j] + " ");
            }
        }
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
        state_of_wakanda_2(arr);
        scn.close();
    }
}
