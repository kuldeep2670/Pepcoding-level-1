package Ze_exceptionHandling_BufferedReaderAndWriter;
import java.util.*;
public class l01_exceptions {
    public static void main(String[] args){
        // int x = 20;
        // int y = 0;
        // //System.out.println(divideLBYL(x,y));
        // System.out.println(divideEAFP(x, y));

        System.out.println(getInt());
    }

    private static int getInt(){
        Scanner scn = new Scanner(System.in);
        return scn.nextInt();
    }

    private static int getIntEAFP(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter an int value");
        try{
            return scn.nextInt();

        }catch(InputMismatchException e){
            return 0;
        }

    }
    
    public static double divideLBYL(int x, int y){ //look before you leap
        if(y != 0){
            return x/y;
        }else 
            return 0;
    }

    public static double divideEAFP(int x, int y){ //Easier to Ask Forgiveness than Permission
        try{
            return x/y;
        }catch(ArithmeticException e){
            return 0;
        }
    }
}
