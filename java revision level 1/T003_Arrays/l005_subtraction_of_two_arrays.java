package T003_Arrays;
import java.util.*;;
public class l005_subtraction_of_two_arrays {

    public static void differenceOfTwoArray(int[] a, int[] b){
        int [] ans = new int[b.length];
        int i = a.length - 1, j = b.length - 1, k = b.length - 1, borrow = 0;
        while(k >= 0){
            int sub = 0;
            sub += borrow + b[j];
            
            if(i >= 0)
                sub -= a[i];
            
            if(sub < 0){
                sub += 10;
                borrow = -1;
            }else
                borrow = 0;

            ans[k] = sub;
            i--;
            j--;
            k--;
        }

        int fnzi = -1; // first non zero index in ans array
        for(i = 0; i < b.length; i++){
            if(ans[i] != 0){
                fnzi = i;
                break;
            }
        }

        if(fnzi == -1)
            System.out.print("0");
        else{
            for(i = fnzi; i < b.length; i++)
                System.out.print(ans[i] + " ");
        }
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

        differenceOfTwoArray(a,b);
        scn.close();
    }
}
