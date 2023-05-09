package T006_recursion;
import java.util.*;;
public class l007_print_zig_zag {
    public static void print_zig_zag(int n){
        if(n == 0)
            return;
        
        System.out.println("Pre " + n);
        print_zig_zag(n - 1);
        System.out.println("In " + n);
        print_zig_zag(n - 1);
        System.out.println("Post " + n);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        print_zig_zag(n);
        scn.close();
    }
}
