package T003_Arrays;
import java.util.*;;
public class l011_first_and_last_index {
    public static int first_index(int[] arr, int x) {
        int l = 0, r = arr.length - 1, mid, fi = -1;
        while (l <= r) {
            mid = (l + r) / 2;
            if (x == arr[mid]) {
                fi = mid;
                r = mid - 1;
            }
            else if (x < arr[mid]) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return fi;
    }

    public static int last_index(int[] arr, int x) {
        int l = 0, r = arr.length - 1, mid, li = -1;
        while (l <= r) {
            mid = (l + r) / 2;
            if (x == arr[mid]) {
                li = mid;
                l = mid + 1;
            }
            else if (x < arr[mid]) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return li;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();

        int x = scn.nextInt();

        int fi = first_index(arr, x);
        int li = last_index(arr, x);

        System.out.println("first index: " + fi +"  last index: " + li);
        scn.close();
    }
}
