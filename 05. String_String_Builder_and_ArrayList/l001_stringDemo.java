import java.util.Scanner;
public class l001_stringDemo {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        //creation
        // String str = "kuldeep";
        // String str2 = "singh";
        // string str = new String("kuldeep");
        // string str = new String();

        // System.out.ptintln(str.length());

        // char ch = str.charAt(3);
        // System.out.println(ch);

        // concatenation
        // String ans = str + " " + str2;
        // System.out.println(ans);

        //imput
        // System.out.println("enter the string:");
        //String str = scn.next();
        // String str = scn.nextLine();
        // System.out.println(str);
        
        //char input
        // char ch = scn.next().charAt(0);
        // System.out.println(ch);
         
        //String a = "hello";
        String b = "hello";
        String c = new String("hello");

        // if(a == b){
        //     System.out.println("yes");
        // } 
        // else{
        //     System.out.println("no");
        // }
        if(c.equals(b) == true){
            System.out.println("yes");
        } 
        else{
            System.out.println("no");
        }
        scn.close();
    }
}
