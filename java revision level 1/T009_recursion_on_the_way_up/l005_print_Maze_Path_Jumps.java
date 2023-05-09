package T009_recursion_on_the_way_up;

import java.util.*;

public class l005_print_Maze_Path_Jumps {

    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {

        if(sr == dr && sc == dc){
            System.out.println(psf);
            return;
        }

        for (int jump = 1; sc + jump <= dc; jump++)
            printMazePaths(sr, sc + jump, dr, dc, psf + "h" + jump);

        for (int jump = 1; sr + jump <= dr; jump++)
            printMazePaths(sr + jump, sc , dr, dc, psf + "v" + jump);

        for (int jump = 1; sc + jump <= dc && sr + jump <= dr; jump++)
            printMazePaths(sr + jump, sc + jump, dr, dc, psf + "d" + jump);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        printMazePaths(0, 0, n - 1, m - 1, "");
        scn.close();
    }
}
