import java.util.Scanner;
public class l003_stringCompression {
    public static String compression1(String str){
		String ans = "" + str.charAt(0);
        int n = str.length();
        char current, previous;
        for(int i = 1; i < n; i++){
            current = str.charAt(i);
            previous = str.charAt(i - 1);
            if(current != previous){
                ans += current;
            }
        }
		return ans;
	}

	public static String compression2(String str){
		String ans = "" + str.charAt(0);
        int n = str.length(), count = 1;
        char current, previous;
        for(int i = 1; i < n; i++){
            current = str.charAt(i);
            previous = str.charAt(i - 1);
            if(current == previous){
                count++;
            } else {
                if(count > 1){
                    ans += count;
                    count = 1;
                }
                ans += current;
            }
        }
        if(count > 1)
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
