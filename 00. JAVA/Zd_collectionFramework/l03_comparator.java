package Zd_collectionFramework;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class l03_comparator implements Comparator<l03_comparator> {
    private double rating;
    private String name;
    private int year;
    
    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public l03_comparator(double rating, String name, int year) {
        this.rating = rating;
        this.name = name;
        this.year = year;
    }

    @Override
    public int compare(l03_comparator o1, l03_comparator o2){
        return o1.year - o2.year;
    }
    public static void main(String[] args) {
        ArrayList<l03_comparator> cmp = new ArrayList<>();
        cmp.add(new l03_comparator(1.2, "anception", 2001));
        cmp.add(new l03_comparator(2.2, "zption", 2045));
        cmp.add(new l03_comparator(1.5, "xncion", 2023));
        cmp.add(new l03_comparator(0.2, "inn", 1994));

        // Sorting based on name
        nameComparator nameCompare = new nameComparator();
        Collections.sort(cmp, nameCompare);
        for(l03_comparator obj: cmp){
            System.out.println(obj.getName()+ " " + obj.getRating()+ " " + obj.getYear());
        }


    }

}
