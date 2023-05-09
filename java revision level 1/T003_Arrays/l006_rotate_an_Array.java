package T003_Arrays;
import java.util.*;
public class l006_rotate_an_Array {
    public static void display(int [] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void reverse(int [] arr, int i, int j){
        int temp;
        while(i <= j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }
    public static void rotate_array(int [] arr, int k){
        int n = arr.length;
        k = ((k % n) + n) % n;

        reverse(arr, 0, n - k - 1);
        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - 1);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        
        int k = scn.nextInt();
        rotate_array(arr, k);
        display(arr);
        scn.close();
    }
}
