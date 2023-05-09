package T011_Linked_List;

import java.util.*;

public class l007_merge_Two_Sorted_LL {
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

        public static LinkedList mergeTwoSortedLL(LinkedList list1, LinkedList list2) {
            Node one = list1.head;
            Node two = list2.head;

            LinkedList res = new LinkedList();
            while (one != null && two != null) {
                if (one.data <= two.data) {
                    res.addLast(one.data);
                    one = one.next;
                } else {
                    res.addLast(two.data);
                    two = two.next;
                }
            }

            while (one != null) {
                res.addLast(one.data);
                one = one.next;
            }

            while (two != null) {
                res.addLast(two.data);
                two = two.next;
            }
            return res;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        LinkedList list1 = new LinkedList();
        int n1 = scn.nextInt();
        for (int i = 0; i < n1; i++) {
            int num1 = scn.nextInt();
            list1.addLast(num1);
        }

        LinkedList list2 = new LinkedList();
        int n2 = scn.nextInt();
        for (int i = 0; i < n2; i++) {
            int num2 = scn.nextInt();
            list2.addLast(num2);
        }

        LinkedList ansList = LinkedList.mergeTwoSortedLL(list1, list2);

        ansList.display();

        scn.close();
    }

}
