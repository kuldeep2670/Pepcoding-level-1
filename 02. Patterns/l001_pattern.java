import java.util.Scanner;

public class l001_pattern {

    // Pattern 0
    // _ _ _ _ _ * * * * *
    // _ _ _ _ _ * * * * *
    // _ _ _ _ _ * * * * *
    // _ _ _ _ _ * * * * *
    // _ _ _ _ _ * * * * *

    public static void pattern0(int n) {
        int nsp = n, nst = n;
        for (int r = 1; r <= n; r++) {
            for (int csp = 1; csp <= nsp; csp++)
                System.out.print("\t");
            for (int cst = 1; cst <= nst; cst++)
                System.out.print("*\t");

            nsp += 0;
            nst += 0;
            System.out.println();
        }
    }

    // Pattern-1
    // *
    // * *
    // * * *
    // * * * *
    // * * * * *

    public static void pattern1(int n) {
        int nsp = 0, nst = 1;
        for (int r = 1; r <= n; r++) {
            for (int csp = 1; csp <= nsp; csp++)
                System.out.print("\t");
            for (int cst = 1; cst <= nst; cst++)
                System.out.print("*\t");

            nst++;
            System.out.println();
        }
    }

    // Pattern-2
    // * * * * *
    // * * * *
    // * * *
    // * *
    // *
    public static void pattern2(int n) {
        int nsp = 0, nst = n;
        for (int r = 1; r <= n; r++) {
            for (int csp = 1; csp <= nsp; csp++)
                System.out.print("\t");
            for (int cst = 1; cst <= nst; cst++)
                System.out.print("*\t");

            nst--;
            System.out.println();
        }
    }

    // pattern-3
    //         *
    //       * *
    //     * * *
    //   * * * *
    // * * * * *
    public static void pattern3(int n) {
        int nsp = n - 1, nst = 1;
        for (int r = 1; r <= n; r++) {
            for (int csp = 1; csp <= nsp; csp++)
                System.out.print("\t");
            for (int cst = 1; cst <= nst; cst++)
                System.out.print("*\t");

            nsp--;
            nst++;
            System.out.println();
        }
    }

    // pattern -4
    // * * * * *
    //   * * * *
    //     * * *
    //       * *
    //         *
    public static void pattern4(int n) {
        int nsp = 0, nst = n;
        for (int r = 1; r <= n; r++) {
            for (int csp = 1; csp <= nsp; csp++)
                System.out.print("\t");
            for (int cst = 1; cst <= nst; cst++)
                System.out.print("*\t");

            nsp++;
            nst--;
            System.out.println();
        }
    }

    //extra pattern - 01 pyramid
    //                                 *
    //                         *       *       *
    //                 *       *       *       *       *
    //         *       *       *       *       *       *       *
    // *       *       *       *       *       *       *       *       *
    public static void extraPattern01(int n) {
        int nsp = n - 1, nst = 1;
        for (int r = 1; r <= n; r++) {
            for (int csp = 1; csp <= nsp; csp++)
                System.out.print("\t");
            for (int cst = 1; cst <= nst; cst++)
                System.out.print("*\t");

            nsp--;
            nst += 2;
            System.out.println();
        }
    }


    // extra pattern - 02  reverse pyramid
    // *       *       *       *       *       *       *       *       *
    //         *       *       *       *       *       *       *
    //                 *       *       *       *       *
    //                         *       *       *
    //                                 *
    public static void extraPattern02(int n) {
        int nsp = 0, nst = 2 * n - 1;
        for (int r = 1; r <= n; r++) {
            for (int csp = 1; csp <= nsp; csp++)
                System.out.print("\t");
            for (int cst = 1; cst <= nst; cst++)
                System.out.print("*\t");

            nsp++;
            nst -= 2;
            System.out.println();
        }
    }

    // Pattern-5 Diamond shaped pattern
    //     *
    //   * * *
    // * * * * *
    //   * * *
    //     *
    public static void pattern5_diamond(int n) {
        int nsp = n / 2, nst = 1;
        for (int r = 1; r <= n; r++) {
            for (int csp = 1; csp <= nsp; csp++)
                System.out.print("\t");
            for (int cst = 1; cst <= nst; cst++)
                System.out.print("*\t");

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

    // Pattern -6
    // * * * - * * *
    // * * - - - * *
    // * - - - - - *
    // * * - - - * *
    // * * * - * * *
    public static void pattern6(int n) {
        int nsp = 1, nst = (n + 1) / 2;
        for (int r = 1; r <= n; r++) {
            for (int cst = 1; cst <= nst; cst++)
                System.out.print("*\t");
            for (int csp = 1; csp <= nsp; csp++)
                System.out.print("\t");
            for (int cst = 1; cst <= nst; cst++)
                System.out.print("*\t");

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

    // pattern-7
    // *
    //     *
    //             *
    //                     *
    //                             *
    public static void pattern7(int rows) {
        for (int r = 1; r <= rows; r++) {
            for (int c = 1; c <= rows; c++) {
                if (r == c)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }

    //Pattern - 8
    //                                 *
    //                         *
    //                 *
    //         *
    // *
    public static void pattern8(int rows) {
        for (int r = 1; r <= rows; r++) {
            for (int c = 1; c <= rows; c++) {
                if (r + c == rows + 1)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }



    //pattern - 9
    // *                               *
    //         *               *
    //                 *
    //         *               *
    // *                               *
    public static void pattern9(int rows) {
        for (int r = 1; r <= rows; r++) {
            for (int c = 1; c <= rows; c++) {
                if (r == c || r + c == rows + 1)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }



    // pattern -  9_01 same as 9 but differnt way
    // *                               *
    //         *               *
    //                 *
    //         *               *
    // *                               *
    public static void pattern9_01(int n) {
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



    //pattern -10
    //                 *
    //         *               *
    // *                               *
    //         *               *
    //                 *
    public static void pattern10(int n) {
        int nsp1 = n / 2, nsp2 = -1;
        for (int r = 1; r <= n; r++) {
            for (int csp1 = 1; csp1 <= nsp1; csp1++)
                System.out.print("\t");

            System.out.print("*\t");

            for (int csp2 = 1; csp2 <= nsp2; csp2++)
                System.out.print("\t");
            if (r > 1 && r < n) {
                System.out.print("*\t");
            }
            if (r <= n / 2) {
                nsp1--;
                nsp2 += 2;

            } else {
                nsp1++;
                nsp2 -= 2;
            }

            System.out.println();
        }

    }

    

        // extra pattern - 03
    // 1
    // 2       2
    // 3       3       3
    // 4       4       4       4
    // 5       5       5       5       5
    public static void extraPattern03(int n) {
        int nst = 1;
        for (int r = 1; r <= n; r++) {
            for (int cst = 1; cst <= nst; cst++)
                System.out.print(nst + "\t");

            nst++;
            System.out.println();
        }
    }

    //pattern-11
    // 1
    // 2       3
    // 4       5       6
    // 7       8       9       10
    // 11      12      13      14      15
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


    //pattern -12
    // 0
    // 1       1
    // 2       3       5
    // 8       13      21      34
    // 55      89      144     233     377
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



    //pattern -13 pascal triangle
    // 1
    // 1       1
    // 1       2       1
    // 1       3       3       1
    // 1       4       6       4       1
    public static void pattern13(int rows) {

        for (int n = 0; n < rows; n++) {
            int val = 1;
            for (int r = 0; r <= n; r++) {
                System.out.print(val + "\t");
                val = ((n - r) * val) / (r + 1);
            }
            System.out.println();
        }
    }



    //extra pattern - 04
    //                 1
    //         2       2       2
    // 3       3       3       3       3
    //         2       2       2
    //                 1
    public static void extraPattern04(int n) {
        int nsp = n / 2, nst = 1;
        for (int r = 1; r <= n; r++) {
            for (int csp = 1; csp <= nsp; csp++)
                System.out.print("\t");

            int count = (r <= n / 2 + 1 ? r : n - r + 1);

            for (int cst = 1; cst <= nst; cst++)
                System.out.print(count + "\t");

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



    //pattern -15 
    //                         1
    //                 2       3       2
    //         3       4       5       4       3
    // 4       5       6       7       6       5       4
    //         3       4       5       4       3
    //                 2       3       2
    //                         1
    public static void pattern15(int n) {
        int nsp = n / 2, nst = 1, val = 1, cval;
        for (int r = 1; r <= n; r++) {
            for (int csp = 1; csp <= nsp; csp++)
                System.out.print("\t");
            cval = val;
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print(cval + "\t");

                if (cst <= nst / 2) {
                    cval++;
                } else {
                    cval--;
                }
            }

            if (r <= (n / 2)) {
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

    // extra pattern =05
        //                         1
        //                 2       1       2
        //         3       2       1       2       3
        // 4       3       2       1       2       3       4
        //         3       2       1       2       3
        //                 2       1       2
        //                         1
        public static void extraPattern05(int n) {
            int nsp = n / 2, nst = 1, val = 1, cval;
            for (int r = 1; r <= n; r++) {
                for (int csp = 1; csp <= nsp; csp++)
                    System.out.print("\t");
                cval = val;
                for (int cst = 1; cst <= nst; cst++) {
                    System.out.print(cval + "\t");
    
                    if (cst <= nst / 2) {
                        cval--;
                    } else {
                        cval++;
                    }
                }
    
                if (r <= (n / 2)) {
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

    //pattern -16 
    // 1                                                               1
    // 1       2                                               2       1
    // 1       2       3                               3       2       1
    // 1       2       3       4               4       3       2       1
    // 1       2       3       4       5       4       3       2       1
    public static void pattern16(int n) {
        int nsp = 2 * n - 3, nst = 1, val;
        for (int r = 1; r <= n; r++) {
            val = 1;
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print(val + "\t");
                val++;
            }

            for (int csp = 1; csp <= nsp; csp++)
                System.out.print("\t");

            if (r == n) {
                nst--;
                val--;
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


    //pattern - 17 Arrow patter using stars
    //                 *
    //                 *       *
    // *       *       *       *       *
    //                 *       *
    //                 *

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
            for (int cst = 1; cst <= nst; cst++)
                System.out.print("*\t");

            if (r <= (n / 2)) {
                nst++;

            } else {
                nst--;
            }
            System.out.println();
        }

    }



    //pattern - 18 hour glass
    // *       *       *       *       *       *       *
    //         *                               *
    //                 *               *
    //                         *
    //                 *       *       *
    //         *       *       *       *       *
    // *       *       *       *       *       *       *

    public static void pattern18(int n) {
        int nsp = 0, nst = n;
        for (int r = 1; r <= n; r++) {
            for (int csp = 1; csp <= nsp; csp++)
                System.out.print("\t");

            for (int cst = 1; cst <= nst; cst++) {
                if (r > 1 && r <= n / 2 && cst > 1 && cst < nst) {
                    System.out.print("\t");
                } else {
                    System.out.print("*\t");
                }
            }
            if (r <= (n / 2)) {
                nsp++;
                nst -= 2;

            } else {
                nsp--;
                nst += 2;
            }
            System.out.println();
        }

    }


    // pattern - 22 reverse hourglass
    // *       *       *       *       *       *       *
    //         *       *       *       *       *
    //                 *       *       *
    //                         *
    //                 *               *
    //         *                               *
    // *       *       *       *       *       *       *

    public static void pattern22(int n) {
        int nsp = 0, nst = n;
        for (int r = 1; r <= n; r++) {
            for (int csp = 1; csp <= nsp; csp++)
                System.out.print("\t");

            for (int cst = 1; cst <= nst; cst++) {
                if (r < n && r > n / 2 + 1 && cst > 1 && cst < nst) {
                    System.out.print("\t");
                } else {
                    System.out.print("*\t");
                }
            }
            if (r <= (n / 2)) {
                nsp++;
                nst -= 2;

            } else {
                nsp--;
                nst += 2;
            }
            System.out.println();
        }

    }



    //pattern - 19 Swastik
    // *       *       *       *                       *
    //                         *                       *
    //                         *                       *
    // *       *       *       *       *       *       *
    // *                       *
    // *                       *
    // *                       *       *       *       *
    public static void pattern19(int n) {

        for (int r = 1; r <= n; r++) {

            for (int cst = 1; cst <= n; cst++) {
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



    // pattern - 20 W
        // *                               *
        // *                               *
        // *               *               *
        // *       *               *       *
        // *                               *
    public static void pattern20(int n) {

        for (int r = 1; r <= n; r++) {

            for (int cst = 1; cst <= n; cst++) {
                if (cst == 1 || cst == n) {
                    System.out.print("*\t");
                } else if (r > n / 2 && (r == cst || r + cst == n + 1)) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }


    // pattern - 21 M
    // *                               *
    // *       *               *       *
    // *               *               *
    // *                               *
    // *                               *
    public static void pattern21(int n) {

        for (int r = 1; r <= n; r++) {

            for (int cst = 1; cst <= n; cst++) {
                if (cst == 1 || cst == n) {
                    System.out.print("*\t");
                } else if (r <= n / 2 + 1 && (r == cst || r + cst == n + 1)) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        //pattern7(n);
        // pattern8(n);
        // pattern9(n);
        // pattern9_01(n);
        // pattern10(n);
        // pattern11(n);
        // pattern12(n);
        // pattern13(n);
        // pattern15(n);
        // pattern16(n);
        // pattern17(n);
        // pattern18(n);
        // pattern19(n);
        // pattern20(n);
        // pattern21(n);
        // pattern22(n);
        // extraPattern01(n);
        // extraPattern02(n);
        // extraPattern03(n);
        // extraPattern04(n);
        extraPattern05(n);
        scn.close();
    }
}