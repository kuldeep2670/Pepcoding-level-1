import java.util.Scanner;
public class l007_reverseArray {
    public static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void display(int[] a){
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
    public static void reverse(int[] a){
        int i =0, j = a.length - 1;
        while(i <= j){
            swap(a, i, j);
            i++;
            j--;
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = scn.nextInt();
        }
        reverse(a);
        display(a);
        scn.close();
    }
}
