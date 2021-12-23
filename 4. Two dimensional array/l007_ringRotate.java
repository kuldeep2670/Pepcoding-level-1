import java.util.Scanner;
public class l007_ringRotate {
    public static Scanner scn = new Scanner(System.in);
    
    public static void input(int [][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0;j < arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
    }
    
    public static int [] from2Dto1D(int [][] arr, int s){
        int n = arr.length;
        int m = arr[0].length;

        int minR = s - 1, maxR = n - s;
        int minC = s - 1, maxC = m - s;

        int size = 2 * (maxR - minR + maxC - minC);
        int [] oneD = new int[size];
        int idx = 0;

        for( int i = minR; i <= maxR; i++){
            oneD[idx] = arr[i][minC];
            idx++;
        }
        minC++;

        for( int i = minC; i <= maxC; i++){
            oneD[idx] = arr[maxR][i];
            idx++;
        }
        maxR--;

        for( int i = maxR; i >= minR; i--){
            oneD[idx] = arr[i][maxC];
            idx++;
        }
        maxC--;
        
        for( int i = maxC; i >= minC; i--){
            oneD[idx] = arr[minR][i];
            idx++;
        }
        minR++;

        return oneD;    
    }
    
    public static void rotate(int [] oneD, int r){
        int n = oneD.length;
        r = ((r % n) + n) % n;
        reverse(oneD, 0 , n - r - 1);
        reverse(oneD, n - r , n - 1);
        reverse(oneD, 0 , n - 1);
    }

    public static void reverse(int [] oneD, int i, int j){
        int temp;
        while(i <= j){
            temp = oneD[i];
            oneD[i] = oneD[j];
            oneD[j] = temp;

            i++;
            j--;
        }
    }
    
    public static void from1Dto2D(int [] oneD, int [][] arr,int s){
        int n = arr.length;
        int m = arr[0].length;

        int minR = s - 1, maxR = n - s;
        int minC = s - 1, maxC = m - s;
        int idx = 0;

        for( int i = minR; i <= maxR; i++){
            arr[i][minC] = oneD[idx];
            idx++;
        }
        minC++;

        for( int i = minC; i <= maxC; i++){
            arr[maxR][i] = oneD[idx];
            idx++;
        }
        maxR--;

        for( int i = maxR; i >= minR; i--){
            arr[i][maxC] = oneD[idx];
            idx++;
        }
        maxC--;
        
        for( int i = maxC; i >= minC; i--){
            arr[minR][i] = oneD[idx];
            idx++;
        }
        minR++;
    }

    public static void ringRotate(int [][] arr, int s, int r){
        //from 2d to 1d
        //then  rotate
        // from 1d to 2d
        int [] oneD = from2Dto1D(arr, s);
        rotate(oneD, r);
        from1Dto2D(oneD,arr, s);
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int n = scn.nextInt();
        int m = scn.nextInt();
        int [][] arr = new int[n][m];
        input(arr);
        int s = scn.nextInt();
        int r = scn.nextInt();
        ringRotate(arr,s, r);
        display(arr);
    }
}
