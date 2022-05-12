import java.util.Scanner;
public class l006_stringWithDifferences {
    public static String solution(String str){
		StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        int diff;
        for(int i = 1; i < str.length(); i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);  
            diff = curr - prev;
            sb.append(diff);
            sb.append(curr);
        }
		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
        scn.close();
	}  
}
