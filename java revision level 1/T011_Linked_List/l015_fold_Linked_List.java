package T011_Linked_List;
import java.util.*;
public class l015_fold_Linked_List {
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

        Node midNode(Node head){
            Node slow = head;
            Node fast = head;

            while(fast.next != null && fast.next.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }

        Node reverse(Node head){
            Node prev = null;
            Node curr = head;
            Node forw = null;
            while(curr != null){
                forw = curr.next;
                curr.next = prev;
                prev = curr;
                curr = forw;
            }
            return prev;
        }

        void fold(Node head){
            if(head == null || head.next == null)
                return;
            
            Node mid = midNode(head);
            Node newHead = mid.next;
            mid.next = null;

            newHead = reverse(newHead);
            Node c1 = head;
            Node c2 = newHead;
            Node f1 = null;
            Node f2 = null;

            while(c2 != null){
                //backup values in forward
                f1 = c1.next;
                f2 = c2.next;

                //links
                c1.next = c2;
                c2.next = f1;

                //moving to next
                c1 = f1;
                c2 = f2;
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
        
        list.fold(list.head);
        
        list.display(list.head);

        scn.close();
    }
}
