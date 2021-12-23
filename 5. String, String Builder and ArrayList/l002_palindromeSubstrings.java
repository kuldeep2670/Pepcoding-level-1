import java.util.Scanner;
public class l002_palindromeSubstrings {

    public static boolean isPalindrome(String s){
        int n = s.length() - 1;
        for(int i = 0; i <= n / 2; i++){
            if(s.charAt(i) != s.charAt(n - i)){
               return false; 
            }
        }
        return true;
    }

    public static void solution(String str){
        int n = str.length();
        for(int start = 0; start < n; start++){
            for(int end = start; end < n; end++){
                
                String subS = str.substring(start, end + 1);
                if(isPalindrome(subS) == true){
                    System.out.println(subS);
                } 
            }
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
        scn.close();
    }
}
