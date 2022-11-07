package Zd_collectionFramework;
import java.util.*;

public class l08_TreeMap {
    public static void main(String[] args){
        TreeMap<Integer, String> lhm = new TreeMap<>();

        lhm.put(1, "a");
        lhm.put(4,"d");
        lhm.put(2, "b");
        lhm.put(5, "e");
        lhm.put(3, "c");

        Set set = lhm.entrySet();
        Iterator it = set.iterator();
        while(it.hasNext()){
            Map.Entry me = (Map.Entry)it.next();

            System.out.println("key is:" + me.getKey() + " and the value is "+ me.getValue());
        }
        
    }
}
