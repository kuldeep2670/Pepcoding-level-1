package T009_recursion_on_the_way_up;
import java.util.*;
public class l003_print_Stair_path {

    public static void printStairPath(int n, String psf){ // path so far
        if(n == 0){
            System.out.println(psf);
            return;
        }

        if(n < 0){
            return;
        }

        printStairPath(n - 1, psf + "1");
        printStairPath(n - 2, psf + "2");
        printStairPath(n - 3, psf + "3");

        // for(int step = 1; step <= 3; step++){
        //     if(n - step >= 0){
        //         printStairPath(n - step, psf + step);
        //     }

        // }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printStairPath(n, "");
        scn.close();

    }
}
