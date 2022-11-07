package Zd_collectionFramework;
import java.util.*;

public class l04_HashMap {
    public static void main(String[] args) {
        Map<String, String> hm = new HashMap<>();
        hm.put("Manish", "Cofounder");
        hm.put("Atulya", "founder");
        hm.put("vaibhav", "CDM");
        hm.put("Aashay", "coFounder");
        hm.put("Ishann","CP");

        //remove
        hm.remove("Atulya");

        // replace
        hm.replace("Manish", "COFOUNDER"); // ( key , value )

        hm.replace("Manish", "COFOUNDER", "cofsfhjk"); // ( key , oldValue,   newValue )


        for(String key: hm.keySet()){
            System.out.println(key + "-"+ hm.get(key));
        }

        
    }
}
 