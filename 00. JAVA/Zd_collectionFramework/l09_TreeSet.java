package Zd_collectionFramework;
import java.util.*;
public class l09_TreeSet {
    public static void main(String[] args){
        TreeSet<String> value = new TreeSet<>();
        value.add("kuldeep");
        value.add("amrit");
        value.add("gurman");
        Iterator<String> it = value.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
