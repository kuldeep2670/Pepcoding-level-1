package T011_Linked_List;
import java.util.*;
public class l013_reverseLL_recursive {
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

        Node reverse(Node head){
            if(head == null || head.next == null)
                return head;
            
            Node newHeadnode = reverse(head.next);
            head.next.next = head;
            head.next = null;

            return newHeadnode;
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
        
        Node revList = list.reverse(list.head);

        list.display(revList);

        scn.close();
    }
}
