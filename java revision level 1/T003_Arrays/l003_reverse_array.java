package T003_Arrays;
import java.util.*;
public class l003_reverse_array {

    public static void display_array(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
    public static void reverse_array(int[] arr){
        int i = 0, j = arr.length - 1;
        while(i <= j){
            swap(arr, i, j);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        reverse_array(arr);
        display_array(arr);
        scn.close();
    }
}
