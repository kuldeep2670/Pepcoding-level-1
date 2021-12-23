//import java.util.Scanner;
public class l005_stringbuilerdemo {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        int st = (int)System.currentTimeMillis();
        for(int i = 0; i < 1000; i++){
            sb.append(i);
        }
        int et = (int)System.currentTimeMillis();
        int diff = et - st;
        System.out.println(diff);

    }
}
