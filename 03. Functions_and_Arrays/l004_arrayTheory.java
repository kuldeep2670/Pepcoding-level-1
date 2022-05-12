import java.util.Scanner;
public class l004_arrayTheory {
    public static Scanner scn = new Scanner(System.in);
    
    public static void takeInput(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();   // setter
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");  // getter
        }
        System.out.println();
    }

    public static void findElement(int[] arr,int data){
        int found = -1;
        for(int i = 0; i < arr.length;i++){
            if(arr[i] == data ){
                found = i;
                break;
            }
        }
        System.out.println(found);
    }

    public static int maximum(int[] arr){
        int n = arr.length, maxEle = Integer.MIN_VALUE;
        for(int i = 0; i < n;i++){
            maxEle = Math.max(maxEle,arr[i]);
        }
        return maxEle;
    }

    public static int minimum(int[] arr){
        int n = arr.length, minEle = Integer.MAX_VALUE;
        for(int i = 0; i < n;i++){
            minEle = Math.min(minEle,arr[i]);
        }
        return minEle;
    }
    public static void spanOfArray(int[] arr){
        int n = arr.length, minimum = Integer.MAX_VALUE, maximum = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            minimum = Math.min(minimum, arr[i]);
            maximum = Math.max(maximum, arr[i]);
        }
        System.out.println(maximum - minimum);
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        takeInput(arr);
        spanOfArray(arr);  

    }
}
