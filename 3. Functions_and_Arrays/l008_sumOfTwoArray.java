import java.util.Scanner;
public class l008_sumOfTwoArray {
    public static void sumOfTwoArray(int[] a, int[] b){
        int n1 = a.length, n2 = b.length;
        int size = (n1 > n2) ? n1 : n2;
        int [] ans = new int[size];

        int i = n1 - 1;
        int j = n2 - 1;
        int k = ans.length - 1;
        int carry = 0;

        while(k >= 0){
            int sum = 0;
            sum += carry;
            
            if(i >= 0)
                sum += a[i];
            if(j >= 0)
                sum += b[j];
            
            int val = sum % 10;
            carry = sum / 10;

            ans[k] = val;
            i--;            
            j--;            
            k--;            
            
        }

        if( carry != 0)
            System.out.println(carry);
        for(int ele : ans)
            System.out.println(ele);

    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] a = new int[n1];
        for(int i = 0; i < n1;i++)
            a[i] = scn.nextInt();

        int n2 = scn.nextInt();
        int[] b = new int[n2];
        for(int i = 0; i < n2;i++)
            b[i] = scn.nextInt();

        sumOfTwoArray(a,b);
        scn.close();
    }
}
