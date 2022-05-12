import java.util.Scanner;
public class l005_lastIndex {
    public static int lastIndex(int[] arr, int idx, int x){
        if(idx == arr.length){
            return -1;
        }
        int li = lastIndex(arr, idx + 1, x);
        if(li == -1){
            // we need to find last index
            if(arr[idx] == x){
                return idx;
            }else{
                return li;
            }
        }else{
            // we got our last index
            return li;
        }
        
    } 
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i=0; i< n;i++){
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        int li = lastIndex(arr, 0, x);
        System.out.println(li);
        scn.close();
    }
}
