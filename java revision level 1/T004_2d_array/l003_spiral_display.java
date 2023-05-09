package T004_2d_array;
import java.util.*;
public class l003_spiral_display {

    public static void spiral(int [][] a){
        int r = a.length;
        int c = a[0].length;

        int minR = 0, maxR = r - 1;
        int minC = 0, maxC = c - 1;

        int count = 0, total = r * c;
        while(count < total){
            for(int i = minR; i <= maxR && count < total; i++){
                System.out.print(a[i][minC] + " ");
                count++;
            }
            minC++;

            for(int i = minC; i <= maxC && count < total; i++){
                System.out.print(a[maxR][i] + " ");
                count++;
            }
            maxR--;

            for(int i = maxR; i >= minR && count < total; i--){
                System.out.print(a[i][maxC] + " ");
                count++;
            }
            maxC--;

            for(int i = maxC; i >= minC && count < total; i--){
                System.out.print(a[minR][i] + " ");
                count++;
            }
            minR++;
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int c = scn.nextInt();
        int[][] arr = new int[r][c];

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        spiral(arr);
        scn.close();
    }
}
