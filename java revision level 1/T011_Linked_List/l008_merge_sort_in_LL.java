package T011_Linked_List;

import java.util.*;

public class l008_merge_sort_in_LL {
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

        Node mergeSort(Node node) {

            if (node.next == null)
                return node;

            Node middle = getMiddle(node);
            Node nextOfMiddle = middle.next;

            middle.next = null; // breaking into two linked list
            
            Node left = mergeSort(node);
            Node right = mergeSort(nextOfMiddle);

            Node sortedNode = mergeSortedLL(left, right);
            
            return sortedNode;
        }

        Node getMiddle(Node node) {

            if (node == null)
                return node;

            Node slow = node;
            Node fast = node;
            while (fast.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }

        Node mergeSortedLL(Node left, Node right) {
            // iterative
            Node dummy = new Node(-1);
            Node temp = dummy;

            while(left != null && right != null){
                if(left.data <= right.data){
                    temp.next = left;
                    left = left.next;
                }else{
                    temp.next = right;
                    right = right.next;
                }
                temp = temp.next;
            }
            while(left != null){
                temp.next = left;
                left = left.next;
                temp = temp.next;
            }

            while(right != null){
                temp.next = right;
                right = right.next;
                temp = temp.next;
            }
            return dummy.next;

            // recursive approach
            // Node result = null;
            // if (left == null)
            //     return right;
            // if (right == null)
            //     return left;

            // if (left.data <= right.data) {
            //     result = left;
            //     result.next = mergeSortedLL(left.next, right);
            // } else {
            //     result = right;
            //     result.next = mergeSortedLL(left, right.next);
            // }
            // return result;


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
        list.head = list.mergeSort(list.head);

        System.out.println("sorted ll: ");
        list.display(list.head);

        scn.close();
    }
}
