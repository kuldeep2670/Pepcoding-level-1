package T003_Arrays;

import java.util.*;

public class l009_binary_search {

    public static int binary_search(int[] arr, int x) {
        int l = 0, r = arr.length - 1, mid;
        while (l <= r) {
            mid = (l + r) / 2;
            if (arr[mid] == x)
                return mid;
            else if (arr[mid] < x)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int x = scn.nextInt();

        int ans = binary_search(arr, x);
        System.out.println(ans);
        scn.close();
    }
}
