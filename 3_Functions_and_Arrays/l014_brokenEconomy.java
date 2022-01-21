import java.util.Scanner;
public class l014_brokenEconomy {
    public static void brokenEconomy(int [] a, int x){
        int l = 0, r = a.length -1, mid, ceil = 0, floor = 0;
        while(l <= r){
            mid = (l + r) / 2;
            if(x == a[mid]){
                ceil = a[mid];
                floor = a[mid];
                break;
            }else if(x < a[mid]){
                ceil = a[mid];
                r = mid - 1;
            }else{
                floor = a[mid];
                l = mid + 1;
            }
        }
        System.out.println(ceil);
        System.out.println(floor);
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = scn.nextInt();
        int x = scn.nextInt();
        brokenEconomy(a, x);
        scn.close();
    }
}
