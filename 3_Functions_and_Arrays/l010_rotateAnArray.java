import java.util.Scanner;
public class l010_rotateAnArray {
    
    public static void display(int [] a){
        for(int i = 0; i < a.length; i++)
            System.out.println(a[i]);
    }
    public static void reverse(int [] a, int i, int j){
        int temp;
        while(i <= j){
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;

            i++;
            j--;
        }
    }
    public static void rotateAnArray(int [] a, int k){
        int n = a.length;
        k = ((k % n) + n) % n;
        reverse(a, 0 , n - k - 1);
        reverse(a, n - k , n - 1);
        reverse(a, 0 , n - 1);
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        rotateAnArray(a,k);
        display(a);
        scn.close();
    }    
}
