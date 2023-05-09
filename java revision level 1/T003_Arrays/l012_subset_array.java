package T003_Arrays;
import java.util.*;
public class l012_subset_array {

    public static void subset(int[] arr){
        int n = arr.length;
        int total = (int) Math.pow(2, n);

        for(int i = 0; i < total; i++){
            String str = "";
            int temp = i;

            for(int j = n - 1; j >= 0; j--){
                int d = temp % 2;
                temp = temp / 2;

                if(d == 0)
                    str = "- " + str;
                else
                    str = arr[j] + " " + str;
            }
            System.out.println(str);
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        subset(arr);
        scn.close();
    }
}
