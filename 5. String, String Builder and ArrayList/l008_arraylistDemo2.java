import java.util.Scanner;
import java.util.ArrayList;
public class l008_arraylistDemo2 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        //1. user input
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0; i<5; i++)
        {
            al.add(i+10);
        }
        
        System.out.println("Now Size is " + al.size());
        System.out.println(al);
        //2.delete
        al.remove(2);
        System.out.println(al);

        //3. set is used to update
        System.out.println("now using set function");
        System.out.println(al);
        al.set(1, 100);         //(idx, val)
        System.out.println(al);

        scn.close();

    }    
}
