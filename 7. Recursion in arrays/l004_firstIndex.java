import java.util.Scanner;
public class l004_firstIndex {
    public static int firstIndex(int[] arr, int idx, int x){
        if(idx == arr.length){
            return -1;
        }
        if(arr[idx] == x)
            return idx;
        return firstIndex(arr, idx+1, x);
    } 
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i=0; i< n;i++){
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        int fi = firstIndex(arr, 0, x);
        System.out.println(fi);
        scn.close();
    }
}
