import java.util.Scanner;
public class l004_spiralTraversal {
    public static Scanner scn = new Scanner(System.in);

    public static void input(int [][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0;j < arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
    }
    public static void spiral(int [][] arr){
        int n = arr.length;   //number of rows
        int m = arr[0].length;  //number of columns

        //4 wall creation
        int minR = 0, maxR = n - 1;
        int minC = 0, maxC = m - 1;
        
        int count = 0;
        int total = n * m;
        while(count < total){
            for(int i = minR; i <= maxR && count < total; i++){
                System.out.println(arr[i][minC]);
                count++;
            }
            minC++;

            for(int i = minC; i <=maxC && count < total; i++){
                System.out.println(arr[maxR][i]);
                count++;
            }
            maxR--;

            for(int i = maxR; i >= minR && count < total; i--){
                System.out.println(arr[i][maxC]);
                count++;
            }
            maxC--;

            for(int i = maxC; i >= minC && count < total; i--){
                System.out.println(arr[minR][i]);
                count++;
            }
            minR++;

        }


    }
    public static void main(String[] args)    {
        int n = scn.nextInt();
        int m = scn.nextInt();
        int [][] arr = new int[n][m];
        input(arr); //input function
        spiral(arr);       // spiral function
    }
}
