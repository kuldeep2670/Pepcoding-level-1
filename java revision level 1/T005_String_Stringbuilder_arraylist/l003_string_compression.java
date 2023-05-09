package T005_String_Stringbuilder_arraylist;

import java.util.*;

public class l003_string_compression {

    public static String compression1(String str) {
        String ans = "" + str.charAt(0);

        char curr, prev;
        for (int i = 1; i < str.length(); i++) {
            curr = str.charAt(i);
            prev = str.charAt(i - 1);

            if (curr != prev) {
                ans += curr;
            }
        }
        return ans;
    }

    public static String compression2(String str) {
        String ans = "" + str.charAt(0);
        int count = 1;
        char curr, prev;
        for (int i = 1; i < str.length(); i++) {
            curr = str.charAt(i);
            prev = str.charAt(i - 1);

            if (curr == prev) {
                count++;
            } else {
                if (count > 1) {
                    ans += count;
                    count = 1;
                }
                ans += curr;
            }
        }
        if (count > 1)
            ans += count;

        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(compression1(str));
        System.out.println(compression2(str));
        scn.close();
    }
}
