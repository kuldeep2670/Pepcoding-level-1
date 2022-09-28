package Za_array_arraylist_linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
public class l005_linkedlist {
    public static void main(String[] args) {
        LinkedList<String> engAlpha = new LinkedList<>();
        // engAlpha.add("apple");
        // engAlpha.add("bat");
        // engAlpha.add("cat");
        // engAlpha.add("elephant");
        // engAlpha.add("fish");
        // printList(engAlpha);
        // engAlpha.add(3, "dog");
        // printList(engAlpha);
        // engAlpha.remove(2);
        // printList(engAlpha);
        addInAscOrd(engAlpha, "apple");
        addInAscOrd(engAlpha, "fish");
        addInAscOrd(engAlpha, "cat");
        addInAscOrd(engAlpha, "zebra");
        addInAscOrd(engAlpha, "dog");
        addInAscOrd(engAlpha, "monkey");

        printList(engAlpha);
        
    }
    
    private static void printList(LinkedList<String> linkedlist){
        Iterator<String> i= linkedlist.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println(".......................");
    }

    private static boolean addInAscOrd(LinkedList<String> linkedlist, String newWord){
        ListIterator<String> stringListIterator = linkedlist.listIterator();
        while(stringListIterator.hasNext()){
            int compare = stringListIterator.next().compareTo(newWord);

            if(compare == 0){
                System.out.println("word already exist");
                return false;
            }else if(compare > 0){
                 // new word would come before
                stringListIterator.previous();
                stringListIterator.add(newWord);
                return true;
            }else if(compare < 0){
                
            }
        }
        stringListIterator.add(newWord);
        return true;
    }

}
