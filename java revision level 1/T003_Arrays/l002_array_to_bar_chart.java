package T003_Arrays;

import java.util.*;

public class l002_array_to_bar_chart {

    public static int maximum(int[] arr) {
        int max = -(int) 1e9;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void array_to_bar_chart(int[] arr) {
        int max = maximum(arr);
        for (int h = max; h >= 1; h--) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= h)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }

    public static void array_to_inverse_bar_chart(int[] arr) {
        int max = maximum(arr);
        for (int h = 0; h < max; h++) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > h)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        // array_to_bar_chart(arr);
        array_to_inverse_bar_chart(arr);
        scn.close();
    }
}
