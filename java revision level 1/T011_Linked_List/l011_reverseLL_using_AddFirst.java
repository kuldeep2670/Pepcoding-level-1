package T011_Linked_List;
import java.util.*;
public class l011_reverseLL_using_AddFirst {
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

        static Node th = null;
        static Node tt = null;

        void addFirst(Node node){
            if(th == null){
                th = node;
                tt = node;
            }else{
                node.next = th;
                th = node;
            }
        }
        void reverse(Node head){
            Node curr = head;
            while(curr != null){
                Node forw = curr.next;
                curr.next = null;
                addFirst(curr);

                curr = forw;
            }
            this.head = th;
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
        
        list.reverse(list.head);

        list.display(list.head);

        scn.close();
    }
}
