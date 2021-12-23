import java.util.Scanner;
import java.util.ArrayList;
public class l007_arraylistDemo {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int [] data = {1,3,5,72,13,47,33,89};
        //1. create
        ArrayList<Integer> al = new ArrayList<>();

        // 2. add values
        al.add(20);
        for(int ele: data)
            al.add(ele);

        //3. print  values
        for(int i =0 ;i< al.size();i++)
            System.out.println(al.get(i));

        System.out.println("Now printing from for-each loop");
        for(int ele : al)
            System.out.println(ele);
        
        System.out.println(al);   
        
         //4. how to get value
         int val = al.get(2);                //--   arr[2]

         System.out.println(val);

        

        scn.close();

    }    
}
