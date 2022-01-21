import java.util.Scanner;
public class l001_pattern {
    public static void pattern0(int n){
        int nsp = n, nst = n;
        for(int r = 1; r <= n; r++){
            for(int csp = 1; csp <= nsp; csp++)
                System.out.print("\t");
            for(int cst = 1; cst <= nst; cst++)
                System.out.print("*\t");
            
            nsp += 0;
            nst += 0;
            System.out.println();
        }
    }
    public static void pattern1(int n){
        int nsp = 0, nst = 1;
        for(int r = 1; r <= n; r++){
            for(int csp = 1; csp <= nsp; csp++)
                System.out.print("\t");
            for(int cst = 1; cst <= nst; cst++)
                System.out.print("*\t");
            
            nst++;
            System.out.println();
        }
    }

    public static void pattern2(int n){
        int nsp = 0, nst = n;
        for(int r = 1; r <= n; r++){
            for(int csp = 1; csp <= nsp; csp++)
                System.out.print("\t");
            for(int cst = 1; cst <= nst; cst++)
                System.out.print("*\t");
            
            nst--;
            System.out.println();
        }
    }

    public static void pattern3(int n){
        int nsp = n - 1, nst = 1;
        for(int r = 1; r <= n; r++){
            for(int csp = 1; csp <= nsp; csp++)
                System.out.print("\t");
            for(int cst = 1; cst <= nst; cst++)
                System.out.print("*\t");
            
            nsp--;
            nst++;
            System.out.println();
        }
    }

    public static void pattern4(int n){
        int nsp = 0, nst = n;
        for(int r = 1; r <= n; r++){
            for(int csp = 1; csp <= nsp; csp++)
                System.out.print("\t");
            for(int cst = 1; cst <= nst; cst++)
                System.out.print("*\t");
            
            nsp++;
            nst--;
            System.out.println();
        }
    }

    public static void pattern5_diamond(int n){
        int nsp = n/2 , nst = 1;
        for(int r = 1; r <= n; r++){
            for(int csp = 1; csp <= nsp; csp++)
                System.out.print("\t");
            for(int cst = 1; cst <= nst; cst++)
                System.out.print("*\t");
            
            if(r <= (n/2)){
                nsp--;
                nst +=2;
            } else{
                nsp++;
                nst -=2;
            }
            System.out.println();
        }
    }

    public static void pattern6(int n){
        int nsp = 1 , nst = (n+1)/2;
        for(int r = 1; r <= n; r++){
            for(int cst = 1; cst <= nst; cst++)
                System.out.print("*\t");
            for(int csp = 1; csp <= nsp; csp++)
                System.out.print("\t");
            for(int cst = 1; cst <= nst; cst++)
                System.out.print("*\t");
            
            if(r <= (n/2)){
                nst--;
                nsp += 2;
            } else{
                nst++;
                nsp -= 2;
            }
            System.out.println();
        }
    }

    public static void pattern7(int rows){
        for(int r = 1;r <= rows; r++){
            for(int c = 1; c <= rows; c++){
                if(r == c)
                    System.out.print("*\t"); 
                else
                    System.out.print("\t");
            }
            System.out.println(); 
        }
    }

    public static void pattern8(int rows){
        for(int r = 1;r <= rows; r++){
            for(int c = 1; c <= rows; c++){
                if(r + c == rows+1)
                    System.out.print("*\t"); 
                else
                    System.out.print("\t");
            }
            System.out.println(); 
        }
    }

    public static void pattern9(int rows){
        for(int r = 1;r <= rows; r++){
            for(int c = 1; c <= rows; c++){
                if(r == c || r + c == rows+1)
                    System.out.print("*\t"); 
                else
                    System.out.print("\t");
            }
            System.out.println(); 
        }
    }
    
    public static void pattern9_01(int n){
        int nsp1 = 0, nsp2 = n - 2;
        for(int r = 1; r <= n; r++){
            for(int csp1 = 1; csp1 <= nsp1; csp1++)
                System.out.print("\t");

            System.out.print("*\t");

            for(int csp2 = 1; csp2 <= nsp2; csp2++)
                System.out.print("\t");
             if(r!=(n+1)/2){   
                System.out.print("*\t");
             }
            if(r<=n/2){
                nsp1++;
                nsp2-=2;

            }
            else{
                nsp1--;
                nsp2+=2;
            }
            
            System.out.println();
        }
       
    }

    public static void pattern10(int n){
        int nsp1 = n/2, nsp2 = -1;
        for(int r = 1; r <= n; r++){
            for(int csp1 = 1; csp1 <= nsp1; csp1++)
                System.out.print("\t");

            System.out.print("*\t");

            for(int csp2 = 1; csp2 <= nsp2; csp2++)
                System.out.print("\t");
            if(r>1 && r<n){   
                System.out.print("*\t");
            }
            if(r<=n/2){
                nsp1--;
                nsp2+=2;

            }
            else{
                nsp1++;
                nsp2-=2;
            }
            
            System.out.println();
        }
       
    }

    public static void pattern11(int n){
        int nst = 1, count = 1;
        for(int r = 1; r <= n; r++){
            for(int cst = 1; cst <= nst; cst++){
                System.out.print(count++ + "\t");
                
            }
            nst++;
            System.out.println();
        }
    }

    public static void pattern12(int n){
        int nst = 1, a=0, b=1, c;
        for(int r = 1; r <= n; r++){
            for(int cst = 1; cst <= nst; cst++){
                System.out.print(a + "\t");
                c = a + b;
                a = b;
                b = c;
            }
            nst++;
            System.out.println();
        }
    }

    public static void pattern13(int rows){
  
        for(int n = 0; n < rows; n++) {
            int val = 1;
           for(int r = 0; r <= n; r++){
              System.out.print(val + "\t");
              val = ((n - r ) * val) / (r + 1);
           }
           System.out.println();
        }
    }

    public static void pattern15(int n){
        int nsp = n/2 , nst = 1, val = 1, cval;
        for(int r = 1; r <= n; r++){
            for(int csp = 1; csp <= nsp; csp++)
                System.out.print("\t");
            cval = val;
            for(int cst = 1; cst <= nst; cst++){
                System.out.print(cval + "\t");

                if(cst <= nst/2){
                    cval++;
                } else {
                    cval--;
                }
            }

            if(r <= (n/2)){
                nsp--;
                nst +=2;
                val++;
            } else{
                nsp++;
                nst -=2;
                val--;
            }
            System.out.println();
        }
    }

    public static void pattern16(int n){
        int nsp = 2 * n - 3 , nst = 1, val;
        for(int r = 1; r <= n; r++){
            val = 1;
            for(int cst = 1; cst <= nst; cst++){
                System.out.print(val + "\t");
                val++;
            }

            for(int csp = 1; csp <= nsp; csp++)
                System.out.print("\t");
            
            if(r == n){
                nst--;
                val--;
            }
            for(int cst = 1; cst <= nst; cst++){
                val--;
                System.out.print(val + "\t");
            }
            
            nst++;
            nsp -= 2;
            System.out.println();
        }
    }

    public static void pattern17(int n){
        int nsp = n/2 , nst = 1;
        for(int r = 1; r <= n; r++){
            for(int csp = 1; csp <= nsp; csp++){
                if(r == n / 2 +1 ){
                    System.out.print("*\t"); 
                }else {
                    System.out.print("\t");
                }
            }
            for(int cst = 1; cst <= nst; cst++)
                System.out.print("*\t");
            
            if(r <= (n/2)){
                nst++;
                
            } else{
                nst--;
            }
            System.out.println();
        }
        
    }

    public static void pattern18(int n){
        int nsp = 0 , nst = n;
        for(int r = 1; r <= n; r++){
            for(int csp = 1; csp <= nsp; csp++)
                System.out.print("\t");
            
            for(int cst = 1; cst <= nst; cst++){
                if(r > 1 && r <= n/2 && cst > 1 && cst < nst){
                    System.out.print("\t"); 
                } else{
                    System.out.print("*\t");
                }
            }
            if(r <= (n/2)){
                nsp++;
                nst -=2;
                
            } else{
                nsp--;
                nst += 2;
            }
            System.out.println();
        }

    }

    public static void pattern19(int n){
        
        for(int r = 1; r <= n; r++){
            
            for(int cst = 1; cst <= n; cst++){
                if( r == 1){
                    if(cst == n || cst <= n / 2 + 1)
                        System.out.print("*\t");
                    else
                        System.out.print("\t");
                } else if(r <= n / 2) {
                    if(cst == n || cst == n / 2 + 1)
                        System.out.print("*\t");
                    else
                        System.out.print("\t");

                }else if(r == n /2 + 1){
                    System.out.print("*\t");

                }else if(r < n ){
                    if(cst == 1 || cst == n / 2 + 1)
                        System.out.print("*\t");
                    else
                        System.out.print("\t");

                }else{
                    if(cst == 1 || cst >= n / 2 + 1)
                        System.out.print("*\t");
                    else
                        System.out.print("\t");
                }     
            }
            System.out.println();
        }
    }

    public static void pattern20(int n){
        
        for(int r = 1; r <= n; r++){
            
            for(int cst = 1; cst <= n; cst++){
                if(cst == 1 || cst == n ){
                    System.out.print("*\t");
                } else if(r > n / 2 && (r == cst || r + cst == n + 1)){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }     
            }
            System.out.println();
        }
    }

    public static void pattern21(int n){
        
        for(int r = 1; r <= n; r++){
            
            for(int cst = 1; cst <= n; cst++){
                if(cst == 1 || cst == n ){
                    System.out.print("*\t");
                } else if(r <= n / 2 + 1 && (r == cst || r + cst == n + 1)){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }     
            }
            System.out.println();
        }
    }

    public static void pattern22(int n){
        int nsp = 0 , nst = n;
        for(int r = 1; r <= n; r++){
            for(int csp = 1; csp <= nsp; csp++)
                System.out.print("\t");
            
            for(int cst = 1; cst <= nst; cst++){
                if(r < n && r > n/2+1 && cst > 1 && cst < nst){
                    System.out.print("\t"); 
                } else{
                    System.out.print("*\t");
                }
            }
            if(r <= (n/2)){
                nsp++;
                nst -=2;
                
            } else{
                nsp--;
                nst += 2;
            }
            System.out.println();
        }

    }

    public static void extraPattern01(int n){
        int nsp = n - 1, nst = 1;
        for(int r = 1; r <= n; r++){
            for(int csp = 1; csp <= nsp; csp++)
                System.out.print("\t");
            for(int cst = 1; cst <= nst; cst++)
                System.out.print("*\t");
            
            nsp--;
            nst += 2;
            System.out.println();
        }
    }

    public static void extraPattern02(int n){
        int nsp = 0, nst = 2*n -1;
        for(int r = 1; r <= n; r++){
            for(int csp = 1; csp <= nsp; csp++)
                System.out.print("\t");
            for(int cst = 1; cst <= nst; cst++)
                System.out.print("*\t");
            
            nsp++;
            nst -= 2;
            System.out.println();
        }
    }

    public static void extraPattern03(int n){
        int nst = 1;
        for(int r = 1; r <= n; r++){
            for(int cst = 1; cst <= nst; cst++)
                System.out.print(nst + "\t");
            
            nst++;
            System.out.println();
        }
    }

    

    public static void extraPattern04(int n){
        int nsp = n/2 , nst = 1;
        for(int r = 1; r <= n; r++){
            for(int csp = 1; csp <= nsp; csp++)
                System.out.print("\t");

            int count = (r <= n/2 + 1 ? r : n-r+1); 

            for(int cst = 1; cst <= nst; cst++)
                System.out.print(count + "\t");
            
            if(r <= (n/2)){
                nsp--;
                nst +=2;
                
            } else{
                nsp++;
                nst -=2;
                
            }
            System.out.println();
        }
    }

    public static void extraPattern05(int n){
        int nsp = n/2 , nst = 1, val = 1, cval;
        for(int r = 1; r <= n; r++){
            for(int csp = 1; csp <= nsp; csp++)
                System.out.print("\t");
            cval = val;
            for(int cst = 1; cst <= nst; cst++){
                System.out.print(cval + "\t");

                if(cst <= nst/2){
                    cval--;
                } else {
                    cval++;
                }
            }

            if(r <= (n/2)){
                nsp--;
                nst +=2;
                val++;
            } else{
                nsp++;
                nst -=2;
                val--;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pattern22(n);
        scn.close();
    }
}