package T008_recursion_in_arraylist;
import java.util.*;
public class l004_get_Maze_Path {

    public static ArrayList<String> getMazePath(int sr, int sc, int dr, int dc){

        if(sr == dr && sc == dc){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        ArrayList<String> paths = new ArrayList<>();

        if(sc < dc){
            ArrayList<String> hpaths = getMazePath(sr, sc + 1, dr, dc);
            for(String hpath: hpaths)
            paths.add("h" + hpath);
        }
        if(sr < dr){
            ArrayList<String> vpaths = getMazePath(sr + 1, sc, dr, dc);
            for(String vpath: vpaths)
            paths.add("v" + vpath);
        }
        
        return paths;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();

        ArrayList<String> paths = getMazePath(0, 0, m-1, n-1);
        System.out.println(paths);
        scn.close();
    }
}
