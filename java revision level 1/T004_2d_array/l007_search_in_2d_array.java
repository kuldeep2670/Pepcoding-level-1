package T004_2d_array;
import java.util.*;
public class l007_search_in_2d_array {

    public static void search_in_2d_array(int [][] arr, int x){
        int r = arr.length;
        int c = arr[0].length;

        int i = 0, j = c - 1;
        while(j >= 0 && i <= r - 1){
            if(arr[i][j] == x){
                System.out.println(i);
                System.out.println(j);
                return;
            }else if(arr[i][j] > x){
                j--;
            }else{
                i++;
            }
        }
        System.out.println("NOT FOUND!!!!");
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int c = scn.nextInt();
        int [][] arr = new int[r][c];

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c ; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        int x = scn.nextInt();
        search_in_2d_array(arr, x);
        scn.close();
    }
}
