import java.util.Scanner;
public class l013_binarySearch {
    public static int binarySearch(int [] a, int x){
        int l = 0, r = a.length -1, mid;
        while(l <= r){
            mid = (l + r) / 2;
            if(x == a[mid]){
                return mid;
            }else if(x < a[mid]){
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = scn.nextInt();
        int x = scn.nextInt();
        int ans = binarySearch(a, x);
        System.out.println(ans);
        scn.close();
    }
}
