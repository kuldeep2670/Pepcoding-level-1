import java.util.Scanner;
public class l015_firstAndLastIndex {
    public static int firstIndex(int[] a, int x){
        int l = 0, r = a.length - 1, mid;
        int fi = -1;

        while(l <= r){
            mid = (l + r) / 2;
            if(x == a[mid]){
                fi = mid;
                r = mid -1;
            }else if(x < a[mid]){
                r = mid - 1;
            }else{
                l = mid + 1;
            }

        }
        return fi;
    }
    public static int lastIndex(int[] a, int x){
        int l = 0, r = a.length - 1, mid;
        int la = -1;

        while(l <= r){
            mid = (l + r) / 2;
            if(x == a[mid]){
                la = mid;
                l = mid + 1;
            }else if(x < a[mid]){
                r = mid - 1;
            }else{
                l = mid + 1;
            }

        }
        return la;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = scn.nextInt();
        int x = scn.nextInt();
        int fi = firstIndex(a, x);
        int la = lastIndex(a, x);
        System.out.println(fi);
        System.out.println(la);
        scn.close();
    } 
}
