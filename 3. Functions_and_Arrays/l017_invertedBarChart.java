import java.util.*;
public class l017_invertedBarChart {
    public static Scanner scn = new Scanner(System.in); // globally

  public static void invertedBarchart(int[] arr) {

    // col = arr.length    row = max(arr)

    int col = arr.length;
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      max = Math.max(max, arr[i]);
    }
    int row = max;

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        if (arr[j] > i)
          System.out.print("*\t");
        else
          System.out.print("\t");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) throws Exception {
    // write your code here
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++)
      arr[i] = scn.nextInt();
    invertedBarchart(arr);

  }
}



