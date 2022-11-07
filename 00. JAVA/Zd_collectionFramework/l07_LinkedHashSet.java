package Zd_collectionFramework;

import java.util.*;

public class l07_LinkedHashSet {
    public static void main(String[] args){
        LinkedHashSet<String> value = new LinkedHashSet<>();
        value.add("kuldeep");
        value.add("amrit");
        value.add("gurman");
        Iterator<String> it = value.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
