import java.io.*;

public class l016_mergeSortInLL {
    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        void addLast(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;

            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }

            size++;
        }

        public int size() {
            return size;
        }

        public void display() {
            for (Node temp = head; temp != null; temp = temp.next) {
                System.out.print(temp.data + " ");
            }
            System.out.println();
        }

        public void removeFirst() {
            if (size == 0) {
                System.out.println("List is empty");
            } else if (size == 1) {
                head = tail = null;
                size = 0;
            } else {
                head = head.next;
                size--;
            }
        }

        public int getFirst() {
            if (size == 0) {
                System.out.println("List is empty");
                return -1;
            } else {
                return head.data;
            }
        }

        public int getLast() {
            if (size == 0) {
                System.out.println("List is empty");
                return -1;
            } else {
                return tail.data;
            }
        }

        public int getAt(int idx) {
            if (size == 0) {
                System.out.println("List is empty");
                return -1;
            } else if (idx < 0 || idx >= size) {
                System.out.println("Invalid arguments");
                return -1;
            } else {
                Node temp = head;
                for (int i = 0; i < idx; i++) {
                    temp = temp.next;
                }
                return temp.data;
            }
        }

        public void addFirst(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = head;
            head = temp;

            if (size == 0) {
                tail = temp;
            }

            size++;
        }

        public void addAt(int idx, int val) {
            if (idx < 0 || idx > size) {
                System.out.println("Invalid arguments");
            } else if (idx == 0) {
                addFirst(val);
            } else if (idx == size) {
                addLast(val);
            } else {
                Node node = new Node();
                node.data = val;

                Node temp = head;
                for (int i = 0; i < idx - 1; i++) {
                    temp = temp.next;
                }
                node.next = temp.next;

                temp.next = node;
                size++;
            }
        }

        public void removeLast() {
            if (size == 0) {
                System.out.println("List is empty");
            } else if (size == 1) {
                head = tail = null;
                size = 0;
            } else {
                Node temp = head;
                for (int i = 0; i < size - 2; i++) {
                    temp = temp.next;
                }

                tail = temp;
                tail.next = null;
                size--;
            }
        }

        public void removeAt(int idx) {
            if (idx < 0 || idx >= size) {
                System.out.println("Invalid arguments");
            } else if (idx == 0) {
                removeFirst();
            } else if (idx == size - 1) {
                removeLast();
            } else {
                Node temp = head;
                for (int i = 0; i < idx - 1; i++) {
                    temp = temp.next;
                }

                temp.next = temp.next.next;
                size--;
            }
        }

        private Node getNodeAt(int idx) {
            Node temp = head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            return temp;
        }

        public void reverseDI() {
            int li = 0;
            int ri = size - 1;
            while (li < ri) {
                Node left = getNodeAt(li);
                Node right = getNodeAt(ri);

                int temp = left.data;
                left.data = right.data;
                right.data = temp;

                li++;
                ri--;
            }
        }

        public void reversePI() {
            if (size <= 1) {
                return;
            }

            Node prev = null;
            Node curr = head;
            while (curr != null) {
                Node next = curr.next;

                curr.next = prev;
                prev = curr;
                curr = next;
            }

            Node temp = head;
            head = tail;
            tail = temp;
        }

        /**********************************
         * Get Kth element from last
         *******************************/
        public int kthFromLast(int k) {
            Node slow = head;
            Node fast = head;
            for (int i = 0; i < k; i++) {
                fast = fast.next;
            }
            while (fast.next != null) {
                slow = slow.next;
                fast = fast.next;
            }
            return slow.data;
        }

        /************************************
         * Mid element of Linked List
         ***************************/
        public int mid() {
            Node slow = head;
            Node fast = head;
            while (fast.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow.data;
        }

        /*****************************************
         * Merge two sorted lists
         **********************************/
        public static LinkedList mergeTwoSortedLists(LinkedList l1, LinkedList l2) {
            LinkedList l3 = new LinkedList();
            // c1 is current 1 and c2 is current 2
            Node c1 = l1.head;
            Node c2 = l2.head;
            while (c1 != null && c2 != null) {
                if (c1.data < c2.data) {
                    l3.addLast(c1.data);
                    c1 = c1.next;
                } else {
                    l3.addLast(c2.data);
                    c2 = c2.next;
                }
            }
            while (c1 != null) {
                l3.addLast(c1.data);
                c1 = c1.next;
            }
            while (c2 != null) {
                l3.addLast(c2.data);
                c2 = c2.next;
            }
            return l3;
        }

        /************************************
         * Mid Node
         *****************************************/
        public static Node midNode(Node head, Node tail) {
            Node slow = head;
            Node fast = head;

            while (fast != tail && fast.next != tail) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }

        /********************************
         * Merge Sort
         ***********************************************/
        public static LinkedList mergeSort(Node head, Node tail) {
            if (head == tail) {
                LinkedList base = new LinkedList();
                base.addFirst(head.data);
                return base;
            }

            Node mid = midNode(head, tail);

            LinkedList left = mergeSort(head, mid); // left part
            LinkedList right = mergeSort(mid.next, tail); // right part
            return mergeTwoSortedLists(left, right);
        }

        /*********************************
         * Remove Duplicates in Sorted Linked List
         *************************/
        public void removeDuplicates() {
            LinkedList nl = new LinkedList();
            while (this.size > 0) {
                int val = this.getFirst();
                this.removeFirst();

                if (nl.size == 0 || nl.tail.data != val) {
                    nl.addLast(val);
                }
            }
            this.head = nl.head;
            this.tail = nl.tail;
            this.size = nl.size;
        }

        /**************************************
         * Odd Even Linked List
         **************************************/
        public void oddEven() {
            LinkedList odd = new LinkedList();
            LinkedList even = new LinkedList();

            while (this.size > 0) {
                int val = this.getFirst();
                this.removeFirst();

                if (val % 2 == 0) {
                    // even
                    even.addLast(val);
                } else {
                    // odd
                    odd.addLast(val);
                }
            }

            if (odd.size > 0 && even.size > 0) { // both even and odd are present in list
                odd.tail.next = even.head;
                this.head = odd.head;
                this.tail = even.tail;
                this.size = odd.size + even.size;
            } else if (odd.size > 0) { // only odd is present in list
                this.head = odd.head;
                this.tail = odd.tail;
                this.size = odd.size;
            } else if (even.size > 0) { // only even is present in list
                this.head = even.head;
                this.tail = even.tail;
                this.size = even.size;
            }
        }

        /***********************************
         * k reverse linked list
         ************************/
        /*
         * all groups of k elements in the list get reversed and linked.
         * If the last set has less than k elements, leave it as it is (don't reverse)
         */

        public void kReverse(int k) {
            if (k > this.size) {
                return;
            }
            LinkedList ans = new LinkedList();
            while (this.size >= k) {
                LinkedList tmp = new LinkedList();
                for (int i = 0; i < k; i++) {
                    int val = this.getFirst();
                    this.removeFirst();
                    tmp.addFirst(val);
                }

                if (ans.size == 0) {
                    ans = tmp;
                } else {
                    ans.tail.next = tmp.head;
                    ans.tail = tmp.tail;
                    ans.size += tmp.size;
                }

            }

            // left elements
            if (this.size > 0) {
                ans.tail.next = this.head;
                ans.tail = this.tail;
                ans.size += this.size;
            }

            this.head = ans.head;
            this.tail = ans.tail;
            this.size = ans.size;
        }

        /**********************
         * display reverse linked list (recursively)
         *******************/
        private void displayReverseHelper(Node node) {
            if (node == null) {
                return;
            }
            displayReverseHelper(node.next);
            System.out.print(node.data + " ");
        }

        public void displayReverse() {
            displayReverseHelper(head);
            System.out.println();
        }

        /************************ reverse a linked list(pointer recursive) ***********/
        private void reversePRHelper(Node node) {
            if (node == null) {
                return;
            }
            reversePRHelper(node.next);
            if (node != tail) {
                node.next.next = node;
            }
        }

        public void reversePR() {
            reversePRHelper(this.head);
            head.next = null;
            Node temp = head;
            head = tail;
            tail = temp;
        }

        /*********************** is linkedlist palindrome *********************/
        Node pleft;

        private boolean palindromeHelper(Node right) {
            if (right == null) {
                return true;
            }

            boolean recAns = palindromeHelper(right.next);
            if (recAns == false) {
                return false;
            }
            if (pleft.data != right.data) {
                return false;
            } else {
                // same
                pleft = pleft.next;
                return true;
            }
        }

        public boolean IsPalindrome() {
            pleft = this.head;
            return palindromeHelper(head);
        }

        /********************************* fold a linked list **********************/
        /***************
         * 1->2->3->4->5->6
         * 1->6->2->5->3->4
         **************************/
        Node fleft;
        private void foldHelper(Node right, int count) {
            if (right == null) {
                return;
            }

            foldHelper(right.next, count + 1);
            if (count > size / 2) {
                Node temp = fleft.next;
                fleft.next = right;
                right.next = temp;
                fleft = temp;
            } else if (count == size / 2) {
                tail = right;
                tail.next = null;
            }

        }

        public void fold() {
            fleft = head;
            foldHelper(head, 0);
        }

        /***************intersection of two linked list */
        public static int findIntersection(LinkedList one, LinkedList two){
            Node c1 = one.head;
            Node c2 = two.head;
            
            int d = Math.abs(one.size-two.size);
            if(one.size > two.size ){
                for(int i = 0; i<d; i++)
                  c1 = c1.next;
            }
            else{
                for(int i = 0; i<d; i++){
                    c2 = c2.next;
                }
            }
            
            while(c1 != c2){
                c1 = c1.next;
                c2 = c2.next;
            }
            return c2.data; // c1.data;
            
          }

    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n1 = Integer.parseInt(br.readLine());
        LinkedList l1 = new LinkedList();
        String[] values1 = br.readLine().split(" ");
        for (int i = 0; i < n1; i++) {
            int d = Integer.parseInt(values1[i]);
            l1.addLast(d);
        }

        LinkedList sorted = LinkedList.mergeSort(l1.head, l1.tail);
        sorted.display();
        l1.display();
    }
}
