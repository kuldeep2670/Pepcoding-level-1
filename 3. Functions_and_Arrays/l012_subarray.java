import java.util.Scanner;
public class l012_subarray {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = scn.nextInt();
        }

        for(int start = 0; start < n; start++){
            for(int end = start; end < n; end++){
                for(int k = start; k <= end; k++ ){
                    System.out.print(a[k] + "\t");
                }
                System.out.println();
            }
        }

        scn.close();
    }
}
