package T011_Linked_List;
import java.util.*;
public class l014_ispalindrome {
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

        boolean isPalindrome(Node head){
            Node slow =head;
            Node fast = head;
            Node first = head; // first linked list

            while(fast.next != null && fast.next.next != null){
                fast= fast.next.next;
                slow = slow.next;
            }

            Node second = reverse(slow.next);
            slow.next = null;

            while(first != null && second != null){
                if(first.data != second.data){
                    return false;
                }
                first = first.next;
                second = second.next;
            }
            return true;
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
        
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        LinkedList list = new LinkedList();

        int n = scn.nextInt();
        for (int i = 0; i < n; i++) {
            list.addLast(scn.nextInt());
        }

        list.display(list.head);
        
        System.out.println(list.isPalindrome(list.head));
        

        scn.close();
    }
}
