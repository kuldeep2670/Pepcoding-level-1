package T003_Arrays;

import java.util.*;

public class l010_broken_economy_ceilfloor {
    public static void broken_economy(int[] arr, int x) {
        int l = 0, r = arr.length - 1, mid, ceil = 0, floor = 0;
        while (l <= r) {
            mid = (l + r) / 2;
            if (arr[mid] == x) {
                ceil = arr[mid];
                floor = arr[mid];
                break;
            }

            else if (arr[mid] < x) {
                floor = arr[mid];
                l = mid + 1;
            } else {
                ceil = arr[mid];
                r = mid - 1;
            }
        }
        if (ceil == floor)
            System.out.println(ceil);
        else {
            System.out.println(ceil);
            System.out.println(floor);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int x = scn.nextInt();

        broken_economy(arr, x);

        scn.close();
    }
}
