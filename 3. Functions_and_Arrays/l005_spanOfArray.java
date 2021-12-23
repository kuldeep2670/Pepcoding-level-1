import java.util.Scanner;
public class l005_spanOfArray {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        int span = max - min;
        System.out.println(span);
        scn.close();

    }
    
}
