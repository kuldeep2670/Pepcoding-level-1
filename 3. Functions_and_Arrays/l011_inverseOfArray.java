import java.util.Scanner;
public class l011_inverseOfArray {
    public static int[] inverseAnArray(int [] a){
        int [] ans = new int[a.length];
        for(int i = 0; i < a.length; i++){
            int temp = a[i];
            ans[temp] = i;
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = scn.nextInt();
        int [] ans = inverseAnArray(a);
        
        for(int i = 0; i < n; i++)
            System.out.println(ans[i]);
        scn.close();
    }
}
