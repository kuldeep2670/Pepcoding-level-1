package T008_recursion_in_arraylist;
import java.util.*;
public class l005_get_maze_Path_with_jump {

    public static ArrayList<String> getMazePathJump(int sr, int sc, int dr, int dc){

        if(sr == dr && sc == dc){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base; 
        }

        ArrayList<String> paths = new ArrayList<>();

        for(int jump = 1; sc + jump <= dc; jump++){
            ArrayList<String> hpaths = getMazePathJump(sr, sc + jump, dr, dc);
            for(String hpath: hpaths)
                paths.add("h" + jump + hpath);
        }
        for(int jump = 1; sr + jump <= dr; jump++){
            ArrayList<String> vpaths = getMazePathJump(sr + jump, sc, dr, dc);
            for(String vpath: vpaths)
                paths.add("v" + jump + vpath);
        }
        for(int jump = 1; sc + jump <= dc && sr + jump <= dr; jump++){
            ArrayList<String> dpaths = getMazePathJump(sr + jump, sc + jump, dr, dc);
            for(String dpath: dpaths)
                paths.add("d" + jump + dpath);
        }

        return paths;

    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();

        ArrayList<String> paths = getMazePathJump(0, 0, m-1, n-1);
        System.out.println(paths);
        scn.close();
    }
}
