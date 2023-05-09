package T004_2d_array;

import java.util.*;

public class l004_exit_point_of_matrix {

    public static void exit_point(int[][] a) {
        int r = a.length;
        int c = a[0].length;
        int dir = 0, i = 0, j = 0; // east = 0, south = 1, west = 2, north = 3

        while (true) {
            dir += a[i][j];
            dir %= 4;

            if (dir == 0)
                j++;
            else if (dir == 1)
                i++;
            else if (dir == 2)
                j--;
            else
                i--;

            if (i < 0 || j < 0 || i >= r || j >= c)
                break;
        }
        if (i < 0)
            i++;
        else if (i >= r)
            i--;
        else if (j < 0)
            j++;
        else if (j >= c)
            j--;

        System.out.println("exit point: " + i + " , " + j);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int c = scn.nextInt();
        int[][] arr = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        exit_point(arr);
        scn.close();
    }
}
