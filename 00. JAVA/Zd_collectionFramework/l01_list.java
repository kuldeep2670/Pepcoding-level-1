package Zd_collectionFramework;

import java.util.*;

public class l01_list {
    public static void main(String[] args) {
        List<Integer> newList = new ArrayList<>();
        newList.add(1);
        newList.add(2);
        newList.add(3);
        newList.add(4);
        newList.add(5);
        newList.add(6);
        newList.add(7);
        newList.add(8);

        List<Integer> subList = new ArrayList<>();
        subList.add(5);
        subList.add(6);
        subList.add(7);
        
        //Sort
        Collections.sort(newList); 
        // Collections.sort(newList,Collections.reverseOrder());

        //Searching
        int search = Collections.binarySearch(newList, 8);
        System.out.println("Index  of  8:- "+search);

        //Maximum and Minimum
        int max = Collections.max(newList);
        System.out.println("Max value is :" + max);
        int min = Collections.min(newList);
        System.out.println("Min value is :" + min);

        //sublist in a list
        int index = Collections.indexOfSubList(newList, subList);
        System.out.println("Sublist:" + index);
        

        Iterator It = newList.listIterator();
        while(It.hasNext()){
            System.out.println(It.next());
        }

    }
}
