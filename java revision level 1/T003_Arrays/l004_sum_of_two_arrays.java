package T003_Arrays;
import java.util.*;
public class l004_sum_of_two_arrays {

    public static void sumOfTwoArray(int[] a, int[] b){
        int size = (a.length > b.length) ? a.length: b.length;
        int [] ans = new int[size];

        int i = a.length - 1, j = b.length - 1, k = ans.length - 1;
        int carry = 0;

        while(k >= 0){
            int sum = 0;
            sum += carry;
            if(i >= 0)
                sum += a[i];
            if(j >= 0)
                sum += b[j];

            carry = sum / 10;
            ans[k] = sum % 10;

            i--;
            j--;
            k--;

        }

        if(carry != 0)
            System.out.print(carry + " ");

        for(int ele : ans)
            System.out.print(ele + " ");
    }
    public static void main(String[] args) {
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
