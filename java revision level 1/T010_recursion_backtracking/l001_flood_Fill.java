package T010_recursion_backtracking;
import java.util.*;
public class l001_flood_Fill {

    public static void floodFill(int[][] maze, int r, int c, String psf){

        if(r < 0 || c < 0 || r == maze.length || c == maze[0].length || maze[r][c] == 1){
            return;
        }

        if(r == maze.length - 1 && c == maze[0].length - 1){
            System.out.println(psf);
            return;
        }

        maze[r][c] = 1; // because if we dont make 1 then then goes backward and forward at same time 
                        // leads to stack over flow error, So if we visited one cell then we have to never 
                        // back on that cell.
                        // OR you can make boolean[][] visited array of small size to initiaze that array.
        floodFill(maze, r - 1, c, psf + "t");
        floodFill(maze, r, c - 1, psf + "l");
        floodFill(maze, r + 1, c, psf + "d");
        floodFill(maze, r, c + 1, psf + "r");
        maze[r][c] = 0;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
        int [][] arr = new int[m][n];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        floodFill(arr, 0, 0, "");
        scn.close();
    }
}
