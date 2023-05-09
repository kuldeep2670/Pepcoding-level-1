package T002_basicMathematics;

public class l001_countDigits {

    static int countDigits(int n) {
        int count = 0, num = n;

        // 1st approach
        // while (num != 0) {
        //     num = num / 10;
        //     count++;
        // }

        // Second approach by converting number to string and retjurn the length of
        // string
        // String num2 = Integer.toString(num);
        // count = num2.length();

        // Third approach using log base 10
        count = (int) Math.floor(Math.log10(num) + 1);

        return count;
    }

    public static void main(String[] args) {
        int n = 12345;
        System.out.println("Number of digits: " + countDigits(n));
    }
}
