package T004_2d_array;

import java.util.*;

public class l001_matrix_multiplication {

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

    public static int[][] matrix_mult(int[][] a, int[][] b){
        int r1 = a.length, c1 = a[0].length, c2 = b[0].length, sum;
        int[][] c = new int[r1][c2];
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c2; j++){
                sum = 0;
                for(int k = 0; k < c1; k++){
                    sum += a[i][k] * b[k][j];
                }
                c[i][j] = sum;
            }
        }
        return c;
    }
    public static void main(String[] args){
        
        int r1 = scn.nextInt();
        int c1 = scn.nextInt();
        int[][] a = new int[r1][c1];
        input(a);

        int r2 = scn.nextInt();
        int c2 = scn.nextInt();
        int[][] b = new int[r2][c2];
        input(b);

        if(c1 != r2){
            System.out.println("invalid input");
        }else{
            int[][] c = matrix_mult(a, b);
            display(c);
        }

    }
}
