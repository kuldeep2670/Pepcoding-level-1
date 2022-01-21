import java.util.Scanner;
public class l009_differenceOfTwoArray {
    public static void differenceOfTwoArray(int [] a, int [] b){
        int n1 = a.length, n2 = b.length;
        int [] ans = new int[n2];

        int i = n1 - 1;
        int j = n2 - 1;
        int k = n2 - 1;
        int borrow = 0;

        while(k >= 0){
            int sub = 0;
            sub += borrow + b[j];
            
            if(i >= 0)
                sub -= a[i];
            
            if(sub < 0){
                sub += 10;
                borrow = -1;
            }
            else
                borrow = 0;

            ans[k] = sub;
            i--;            
            j--;            
            k--;            
            
        }

        int fnzi = -1;  //first non zero index
        for(i = 0;i < n2; i++){
            if(ans[i] != 0){
                fnzi = i;
                break;
            }
        } 

        if(fnzi == -1){
            System.out.println("0");
        }else{
            for (i = fnzi; i < n2; i++)
               System.out.println(ans[i]);
        }

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

        differenceOfTwoArray(a,b);
        scn.close();
    }
}
