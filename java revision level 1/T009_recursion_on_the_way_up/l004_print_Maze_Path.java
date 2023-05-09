package T009_recursion_on_the_way_up;
import java.util.*;
public class l004_print_Maze_Path {
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf){

        if(sr == dr && sc == dc){
            System.out.println(psf);
            return;
        }

        if(sc < dc)
            printMazePaths(sr, sc + 1, dr, dc, psf + "h");
        if(sr < dr)
            printMazePaths(sr + 1, sc, dr, dc, psf + "v");
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        printMazePaths(0,0,n-1, m-1, "");
        scn.close();
    }
}
