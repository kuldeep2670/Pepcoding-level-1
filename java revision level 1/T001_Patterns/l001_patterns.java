package T001_Patterns;

import java.util.*;

public class l001_patterns {

    public static void extra_pyramid2(int n) {
        int nsp = 0, nst = 2 * n - 1;
        for (int r = 1; r <= n; r++) {
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("\t");
            }
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print("*\t");
            }
            nsp++;
            nst -= 2;
            System.out.println();
        }
    }

    public static void patter5_diamondshape(int n) {
        int nsp = n / 2, nst = 1;
        for (int r = 1; r <= n; r++) {
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("\t");
            }
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print("*\t");
            }
            if (r <= (n / 2)) {
                nsp--;
                nst += 2;
            } else {
                nsp++;
                nst -= 2;
            }
            System.out.println();
        }
    }

    public static void pattern6(int n) {
        int nsp = 1, nst = (n + 1) / 2;
        for (int r = 1; r <= n; r++) {
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print("*\t");
            }
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("\t");
            }
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print("*\t");
            }
            if (r <= (n / 2)) {
                nst--;
                nsp += 2;
            } else {
                nst++;
                nsp -= 2;
            }
            System.out.println();
        }
    }

    public static void pattern789(int n) {
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= n; c++) {
                if (r == c) { // for pattern8 r+c = n+1 and for pattern 9 both in OR
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

        // pattern 9 secont type
        int nsp1 = 0, nsp2 = n - 2;
        for (int r = 1; r <= n; r++) {
            for (int csp1 = 1; csp1 <= nsp1; csp1++)
                System.out.print("\t");

            System.out.print("*\t");

            for (int csp2 = 1; csp2 <= nsp2; csp2++)
                System.out.print("\t");
            if (r != (n + 1) / 2) {
                System.out.print("*\t");
            }
            if (r <= n / 2) {
                nsp1++;
                nsp2 -= 2;

            } else {
                nsp1--;
                nsp2 += 2;
            }

            System.out.println();
        }
    }

    public static void pattern10(int n) {
        int nsp1 = n / 2, nsp2 = -1;
        for (int r = 1; r <= n; r++) {
            for (int csp1 = 1; csp1 <= nsp1; csp1++) {
                System.out.print("\t");
            }
            System.out.print("*\t");
            for (int csp2 = 1; csp2 <= nsp2; csp2++) {
                System.out.print("\t");
            }
            if (r > 1 && r < n) {
                System.out.print("*\t");
            }
            if (r <= (n / 2)) {
                nsp1--;
                nsp2 += 2;
            } else {
                nsp1++;
                nsp2 -= 2;
            }
            System.out.println();
        }
    }

    public static void extraPattern3(int n) {
        int nst = 1;
        for (int r = 1; r <= n; r++) {
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print(nst + "\t");
            }
            nst++;
            System.out.println();
        }
    }

    public static void pattern11(int n) {
        int nst = 1, count = 1;
        for (int r = 1; r <= n; r++) {
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print(count++ + "\t");
            }
            nst++;
            System.out.println();
        }
    }

    public static void pattern12(int n) {
        int nst = 1, a = 0, b = 1, c;
        for (int r = 1; r <= n; r++) {
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print(a + "\t");
                c = a + b;
                a = b;
                b = c;
            }
            nst++;
            System.out.println();
        }
    }

    public static void pascal13_1(int n) {
        int[][] arr = new int[n][n];

        for (int r = 0; r < n; r++) {
            for (int c = 0; c <= r; c++) {
                if (c == 0 || c == r) {
                    arr[r][c] = 1;
                } else {
                    arr[r][c] = arr[r - 1][c - 1] + arr[r - 1][c];
                }
                System.out.print(arr[r][c] + "\t");
            }
            System.out.println();
        }
    }

    public static void pascal13_2(int n) {
        int val;
        for (int r = 0; r < n; r++) {
            val = 1;
            for (int c = 0; c <= r; c++) {

                System.out.print(val + "\t");
                val = ((r - c) * val) / (c + 1);
            }
            System.out.println();
        }
    }

    public static void extraPattern4(int n) {
        int nsp = n / 2, nst = 1, count;

        for (int r = 1; r <= n; r++) {
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("\t");
            }

            count = (r <= n / 2 + 1) ? r : (n - r + 1);

            for (int cst = 1; cst <= nst; cst++) {
                System.out.print(count + "\t");
            }
            if (r <= n / 2) {
                nsp--;
                nst += 2;
            } else {
                nsp++;
                nst -= 2;
            }
            System.out.println();
        }
    }

    public static void pattern15(int n) {
        int nsp = n / 2, nst = 1, val = 1, cval;

        for (int r = 1; r <= n; r++) {
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("\t");
            }

            cval = val;

            for (int cst = 1; cst <= nst; cst++) {
                System.out.print(cval + "\t");
                if (cst <= nst / 2)
                    cval++;
                else
                    cval--;
            }
            if (r <= n / 2) {
                nsp--;
                nst += 2;
                val++;
            } else {
                nsp++;
                nst -= 2;
                val--;
            }
            System.out.println();
        }
    }

    public static void pattern16(int n) {
        int nsp = 2 * n - 3, nst = 1, val;
        for (int r = 1; r <= n; r++) {
            val = 1;
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print(val + "\t");
                val++;
            }

            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("\t");
            }

            if (r == n) {
                val--;
                nst--;
            }
            for (int cst = 1; cst <= nst; cst++) {
                val--;
                System.out.print(val + "\t");
            }
            nst++;
            nsp -= 2;
            System.out.println();
        }
    }

    public static void pattern17(int n) {
        int nsp = n / 2, nst = 1;
        for (int r = 1; r <= n; r++) {
            for (int csp = 1; csp <= nsp; csp++) {
                if (r == n / 2 + 1) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }

            }
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print("*\t");
            }
            if (r <= (n / 2)) {
                nst++;

            } else {
                nst--;
            }
            System.out.println();
        }
    }

    public static void pattern18(int n){
        int nsp = 0, nst = n;
        for(int r = 1; r<= n ;r++){
            for(int csp = 1; csp <= nsp; csp++){
                System.out.print("\t");
            }

            for(int cst = 1; cst<= nst; cst++){
                if( r > 1 && r<=n/2 && cst > 1 && cst < nst){ 
                    // for inverted hour glass shape
                    // ( r < n && r > n/2 + 1 && cst > 1 && cst < nst)
                    System.out.print("\t");
                }else{
                    System.out.print("*\t");
                }
            }
            if(r <= n/2){
                nsp++;
                nst -=2;
            }else{
                nsp--;
                nst +=2;
            }
            System.out.println();
        }
    }

    public static void pattern19(int n){
        for(int r = 1; r <= n; r++){
            for(int cst = 1; cst <= n; cst++){
                if (r == 1) {
                    if (cst == n || cst <= n / 2 + 1)
                        System.out.print("*\t");
                    else
                        System.out.print("\t");
                } else if (r <= n / 2) {
                    if (cst == n || cst == n / 2 + 1)
                        System.out.print("*\t");
                    else
                        System.out.print("\t");

                } else if (r == n / 2 + 1) {
                    System.out.print("*\t");

                } else if (r < n) {
                    if (cst == 1 || cst == n / 2 + 1)
                        System.out.print("*\t");
                    else
                        System.out.print("\t");

                } else {
                    if (cst == 1 || cst >= n / 2 + 1)
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
                if(cst == 1 || cst == n){
                    System.out.print("*\t");
                }else if(r > n/2 && (r == cst || r + cst == n +1)){
                    // for M ( r<= n/2 + 1)
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // extra_pyramid2(n);
        // patter5_diamondshape(n);
        // pattern6(n);
        // pattern789(n);
        // pattern10(n);
        // extraPattern3(n);
        // pattern11(n);
        // pattern12(n);
        // pascal13_2(n);
        // extraPattern4(n);
        // pattern15(n);
        // pattern16(n);
        // pattern17(n);
        // pattern18(n);
        // pattern19(n);
        pattern20(n);
        scn.close();
    }
}
