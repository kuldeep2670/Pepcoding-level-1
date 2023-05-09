package T011_Linked_List;
import java.util.*;
public class l010_odd_even_Linked_List {
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

        void oddEven(Node head){
            Node evenStart = null;
            Node evenEnd = null;
            Node oddStart = null;
            Node oddEnd = null;

            Node curr = head;
            while(curr != null){
                if(curr.data % 2 != 0){
                    if(oddStart == null){
                        oddStart = curr;
                        oddEnd = oddStart;
                    }else{
                        oddEnd.next = curr;
                        oddEnd = oddEnd.next;
                    }
                }else{
                    if(evenStart == null){
                        evenStart = curr;
                        evenEnd = evenStart;
                    }else{
                        evenEnd.next = curr;
                        evenEnd = evenEnd.next;
                    }
                }
                curr = curr.next;
            }

            if(evenStart != null && oddStart != null){
                oddEnd.next = evenStart;
                evenEnd.next = null;
                head = oddStart;
            }else if(oddStart == null){
                evenEnd.next = null;
                head = evenStart;
            } else if(evenStart == null){
                oddEnd.next = null;
                head = oddStart;
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
        
        list.oddEven(list.head);

         list.display(list.head);

        scn.close();
    }
}
