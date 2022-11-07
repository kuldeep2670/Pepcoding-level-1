package Zd_collectionFramework;
import java.util.*;

public class l05_hashSet {
    public static void main(String[] args){
        Set<String> hst = new HashSet<>();

        hst.add("My");
        hst.add("Name");
        hst.add("is");
        hst.add("kuldeep singh");

        // traverse
        System.out.println(hst); // in a list manner with separated by commas

        hst.remove("is");
        System.out.println(hst);

        Iterator<String> i = hst.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
            
        }
         
        // addition of elements using a list
        Set<Integer> hst1 = new HashSet<>();
        hst1.addAll(Arrays.asList(new Integer[]{1,2,3,4,5,6,9,10}));
        System.out.println(hst1);

        Set<Integer> hst2 = new HashSet<>();
        hst2.addAll(Arrays.asList(new Integer[]{1,2,3,4,5,6,7,8}));
        System.out.println(hst2);

        // Intersection
        Set<Integer> intersection = new HashSet<>(hst1);
        intersection.retainAll(hst2);
        System.out.println(intersection);


        //Union
        Set<Integer> union = new HashSet<>(hst1);
        union.addAll(hst2);
        System.out.println(union);

        //Difference
        Set<Integer> difference = new HashSet<>(hst1);
        difference.removeAll(hst2);
        System.out.println(difference);
    }
}
