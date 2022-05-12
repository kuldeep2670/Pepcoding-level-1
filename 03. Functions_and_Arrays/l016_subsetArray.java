import java.util.Scanner;
public class l016_subsetArray {
    public static void subset(int [] a){
        int n = a.length;
        int total = (int)Math.pow(2, n);
        
        for(int i = 0;i < total; i++){
            
            String str = "";
            int temp = i;
            for(int j = n-1; j>=0; j--){
                int r = temp % 2;
                temp = temp / 2;
                
                if(r == 0){
                    str = "-\t" + str;
                }else{
                    str = a[j] + "\t" + str;
                }
            }
            System.out.println(str);
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = scn.nextInt();
        subset(a);
        scn.close();
    }
}
