package T005_String_Stringbuilder_arraylist;

public class l001_print_all_substring {
    public static void main(String[] args) {
        String str = "Kuldeep";
        for(int i = 0 ; i < str.length(); i++){
            for(int j = i + 1; j <= str.length(); j++){
                System.out.println(str.substring(i, j));
            }
        }
    }    
}
