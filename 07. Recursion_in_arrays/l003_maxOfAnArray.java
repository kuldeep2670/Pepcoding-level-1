import java.util.Scanner;
public class l003_maxOfAnArray {
    public static int maxOfArray(int [] arr, int idx){
        if(idx == arr.length -1){
            return arr[idx];
        }
        int recAns = maxOfArray(arr, idx + 1);
        int me = arr[idx];

        if(me > recAns){
            return me;
        }else{
            return recAns;
        }
        //return (idx == arr.length-1 ) ? arr[idx] : Math.max(arr[idx] , maxOfArray(arr, idx + 1) ) ;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i=0; i< n;i++){
            arr[i] = scn.nextInt();
        }
        int max = maxOfArray(arr, 0);
        System.out.println(max);
        scn.close();
    }
}
