package T011_Linked_List;
import java.util.*;
public class l012_k_reverse_LL {
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

        int length(Node node){
            Node curr = node;
            int len = 0;
            while(curr != null){
                len++;
                curr = curr.next;
            }
            return len;
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
        void kreverse(Node head, int k){
            if(head == null || head.next == null || k == 0)
                return;
            
            Node oh = null;
            Node ot = null;
            int len = length(head);
            Node curr = head;

            while(len >= k){
                int tempk = k;
                while(tempk-- > 0){
                    Node forw = curr.next;
                    curr.next = null;
                    addFirst(curr);
                    curr = forw;
                }

                if(oh == null){
                    oh = th;
                    ot = tt;
                }else{
                    ot.next = th;
                    ot = tt;
                }

                th = null;
                tt = null;
                len -= k;
            }
            
            ot.next = curr;
            this.head = oh;
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
        
        int k = scn.nextInt();
        list.kreverse(list.head,k);

        list.display(list.head);

        scn.close();
    }
}
