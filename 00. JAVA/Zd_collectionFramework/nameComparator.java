package Zd_collectionFramework;

import java.util.Comparator;

public class nameComparator implements Comparator<l03_comparator>{
    
    @Override
    public int compare(l03_comparator o1, l03_comparator o2){
        return o1.getName().compareTo(o2.getName());
    }
}
