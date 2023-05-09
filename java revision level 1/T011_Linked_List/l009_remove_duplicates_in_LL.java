package T011_Linked_List;
import java.util.*;
public class l009_remove_duplicates_in_LL {
    public static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static class LinkedList {
        Node head = null;

        void addLast(int val) {
            Node node = new Node(val);
            if (head == null) {
                head = node;
                return;
            }

            Node last = head;
            while (last.next != null) {
                last = last.next;
            }

            last.next = node;
        }

        void display(Node node) {
            while (node != null) {
                System.out.print(node.data + " -> ");
                node = node.next;
            }
            System.out.println();
        }
        // removing duplicates in sorted linked list
        void removeDuplicates(Node head){
            // Node curr = head;
            
            // while(curr != null){
            //     Node temp = curr;

            //     while(temp != null && temp.data == curr.data){
            //         temp = temp.next;
            //     }

            //     curr.next = temp;
            //     curr = curr.next;
            // }


            //using hashset
            Set<Integer> set = new HashSet<>();
            Node curr = head;
            Node prev = null;
            while(curr != null){
                if(set.contains(curr.data)){
                    prev.next = curr.next;
                }
                else{
                    set.add(curr.data);
                    prev = curr;
                }
                curr = curr.next;
            }
        }

        

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        LinkedList list = new LinkedList();

        int n = scn.nextInt();
        for (int i = 0; i < n; i++) {
            list.addLast(scn.nextInt());
        }

        list.display(list.head);
        
        list.removeDuplicates(list.head);

        list.display(list.head);

        scn.close();
    }
}
