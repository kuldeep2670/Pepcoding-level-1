package T008_recursion_in_arraylist;
import java.util.*;
public class l003_get_Stair_paths {

    public static ArrayList<String> getStairPaths(int n){

        if(n == 0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> myAns = new ArrayList<>();
        // if(n - 1 >= 0){
        //     ArrayList<String> path1 = getStairPaths(n - 1);
        //     for(String ele: path1)
        //         myAns.add("1" + ele);
        // }
        // if(n - 2 >= 0){
        //     ArrayList<String> path2 = getStairPaths(n - 2);
        //     for(String ele: path2)
        //         myAns.add("2" + ele);
        // }
        // if(n - 3 >= 0){
        //     ArrayList<String> path3 = getStairPaths(n - 3);
        //     for(String ele: path3)
        //         myAns.add("3" + ele);
        // }

        for(int i = 1; i <= 3; i++){
            if(n - i >= 0){
                ArrayList<String> recAns = getStairPaths(n - i);
                for(String ele : recAns)
                    myAns.add(i + ele);
            }
        }
        return myAns;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String> paths = getStairPaths(n);
        System.out.println(paths);
        scn.close();
    }
}
