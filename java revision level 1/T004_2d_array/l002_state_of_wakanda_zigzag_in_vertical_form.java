package T004_2d_array;
import java.util.*;
public class l002_state_of_wakanda_zigzag_in_vertical_form {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int c = scn.nextInt();
        int[][] a = new int[r][c];

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                a[i][j] = scn.nextInt();
            }
        }

        System.out.println();

        for(int j = 0; j < c; j++){
            if(j % 2 == 0){
                for(int i = 0; i < r; i++){
                    System.out.print(a[i][j] + " ");
                }
            }else{
                for(int i = r - 1; i >= 0; i--){
                    System.out.print(a[i][j] + " ");
                }
            }
        }

        System.out.println();
        
        for(int j = 0; j < c; j++){
            if(j % 2 == 0){
                for(int i = r - 1; i >= 0; i--){
                    System.out.print(a[i][j] + " ");
                }
                
            }else{
                for(int i = 0; i < r; i++){
                    System.out.print(a[i][j] + " ");
                }
            }
        }

        scn.close();

    }
}
