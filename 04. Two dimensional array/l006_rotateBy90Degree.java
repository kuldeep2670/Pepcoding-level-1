import java.util.Scanner;
public class l006_rotateBy90Degree {
    public static Scanner scn = new Scanner(System.in);
    
    public static void input(int [][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0;j < arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
    }
    public static void transpose(int [][] arr){     
        int n = arr.length, temp;
        for(int i = 0;i < n ; i++){              
            for(int j = 0; j < i; j++){
                temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    public static void reverseColumn(int [][] arr){
        int n = arr.length, temp;
        for(int i =0; i < n; i++){
            for(int j = 0, k = n - 1;j < k; j++, k--){
                temp = arr[i][j];
                arr[i][j] = arr[i][k];
                arr[i][k] = temp;
            }
        }
    }
    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int n = scn.nextInt();
        int [][] arr = new int[n][n];
        input(arr);
        transpose(arr);
        reverseColumn(arr);
        display(arr);
    }
}
