package Zd_collectionFramework;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class l06_LinkedHashMap {
    public static void main(String[] args){
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();

        lhm.put(1, "a");
        lhm.put(2, "b");
        lhm.put(3, "c");
        lhm.put(4,"d");
        lhm.put(5, "e");

        Set set = lhm.entrySet();
        Iterator it = set.iterator();
        while(it.hasNext()){
            Map.Entry me = (Map.Entry)it.next();

            System.out.println("key is:" + me.getKey() + " and the value is "+ me.getValue());
        }
        
    }
}
