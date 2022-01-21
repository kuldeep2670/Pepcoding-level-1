import java.util.Scanner;
public class l008_searchInA2DArray {
    public static void searchIn2DArray(int [][] arr, int x){
        
        int n = arr.length;
        int i = 0, j = n -1; // top right element
        
        while(j >= 0 && i <= n - 1){
            int ele = arr[i][j];
            
            if(ele == x){
                System.out.println(i);
                System.out.println(j);
                return;
            } else if(ele > x){
                j--;
            } else{
                i++;
            }
        }
        System.out.println("Not Found");
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [][] arr = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        int x = scn.nextInt();
        searchIn2DArray(arr, x);
        scn.close();
    }    
}
