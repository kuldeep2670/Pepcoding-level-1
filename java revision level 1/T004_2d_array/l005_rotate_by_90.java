package T004_2d_array;
import java.util.*;
public class l005_rotate_by_90 {
    
    public static Scanner scn = new Scanner(System.in);

    public static void input(int [][] a){
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[0].length; j++){
                a[i][j] = scn.nextInt();
            }
        }
    }

    public static void display(int [][] a){
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[0].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void transpose(int[][] a){
        int temp;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < i; j++){
                temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
    }

    public static void reverse_column(int[][] a){
        int temp, n = a.length;
        for(int i = 0; i < n; i++){
            for(int j = 0, k = n - 1; j < k; j++, k--){
                temp = a[i][j];
                a[i][j] = a[i][k];
                a[i][k] = temp;
            }
        }
    }

    public static void main(String[] args) {
        
        int n = scn.nextInt();
        
        int[][] a = new int[n][n];
        input(a);
        transpose(a);
        System.out.println();
        display(a);
        System.out.println();
        reverse_column(a);
        System.out.println();
        display(a);
        
    }
}
