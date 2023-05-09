package T004_2d_array;

import java.util.*;

public class l006_ring_rotate_shell_rotate {

    public static int[] from_2d_to_1d(int[][] a, int s) {
        int r = a.length, c = a[0].length;

        int minR = s - 1, maxR = r - s;
        int minC = s - 1, maxC = c - s;

        int size = 2 * (maxR - minR + maxC - minC);
        int[] oneD = new int[size];
        int idx = 0;

        for (int i = minR; i <= maxR; i++) {
            oneD[idx] = a[i][minC];
            idx++;
        }
        minC++;

        for (int i = minC; i <= maxC; i++) {
            oneD[idx] = a[maxR][i];
            idx++;
        }
        maxR--;

        for (int i = maxR; i >= minR; i--) {
            oneD[idx] = a[i][maxC];
            idx++;
        }
        maxC--;

        for (int i = maxC; i >= minC; i--) {
            oneD[idx] = a[minR][i];
            idx++;
        }
        minR++;

        return oneD;
    }

    public static void rotate_1D(int[] oneD, int rt) {
        int n = oneD.length;
        reverse(oneD, 0, n - rt - 1);
        reverse(oneD, n - rt, n - 1);
        reverse(oneD, 0, n - 1);

    }

    public static void reverse(int[] oneD, int i, int j) {
        int temp;
        while (i <= j) {
            temp = oneD[i];
            oneD[i] = oneD[j];
            oneD[j] = temp;

            i++;
            j--;
        }
    }

    public static void from_1d_to_2d(int[] oneD, int[][] a, int s) {

        int r = a.length, c = a[0].length;

        int minR = s - 1, maxR = r - s;
        int minC = s - 1, maxC = c - s;

        int idx = 0;

        for (int i = minR; i <= maxR; i++) {
            a[i][minC] = oneD[idx];
            idx++;
        }
        minC++;

        for (int i = minC; i <= maxC; i++) {
            a[maxR][i] = oneD[idx];
            idx++;
        }
        maxR--;

        for (int i = maxR; i >= minR; i--) {
            a[i][maxC] = oneD[idx];
            idx++;
        }
        maxC--;

        for (int i = maxC; i >= minC; i--) {
            a[minR][i] = oneD[idx];
            idx++;
        }
        minR++;

    }

    public static void ring_rotate(int[][] a, int s, int rt) {
        // 2d to 1d --> rotate 1d ---> 1d to 2d
        int[] oneD = from_2d_to_1d(a, s);
        rotate_1D(oneD, rt);
        from_1d_to_2d(oneD, a, s);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int c = scn.nextInt();
        int[][] a = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = scn.nextInt();
            }
        }

        int s = scn.nextInt();
        int rt = scn.nextInt();

        ring_rotate(a, s, rt);

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        scn.close();
    }
}
