package T011_Linked_List;
import java.util.*;
public class l001_linked_List_creation {
    public static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }  

    public static class LinkedList{
        Node head;

        void addLast(int val){
            Node node = new Node(val);
            if(head == null){
                head = node;
                return;
            }

            Node last = head;
            while(last.next != null){
                last = last.next;
            }
            last.next = node;
            return;
        }

        void addFirst(int val){
            Node new_node = new Node(val);

            new_node.next = head;
            head = new_node;
        }

        void addAtIndex(int val, int idx){
            if(idx == 0){
                addFirst(val);
            }else if(idx == size()){
                addLast(val);
            }else if(idx < 0 || idx > size()){
                System.out.println("invalid");
            }else{
                Node new_node = new Node(val);
                
                Node curr = head;
                for(int i = 0; i < idx - 1; i++){
                    curr = curr.next;
                }

                new_node.next = curr.next;
                curr.next = new_node;
            }  
        }

        void deleteFirst(){
            if(head == null){
                System.out.println("LinkedList is empty");
                return;
            }
            head = head.next;
        }

        void deleteLast(){
            if(head == null){
                System.out.println("linked list is empty");
                return;
            }
            Node temp = head;
            while(temp.next.next != null){
                temp = temp.next;
            }
            temp.next = null;
        }

        void deleteAt(int idx){

            if(head == null){
                System.out.println("linked list is empty");
                return;
            }else if(idx == 0)
                deleteFirst();
            else if(idx == size() - 1)
                deleteLast();
            else if(idx < 0 || idx > size() - 1){
                System.out.println("invalid idx");
                return;
            }
            else{
                Node temp = head;
                for(int i = 0; i < idx - 1; i++){
                    temp = temp.next;
                }
                temp.next = temp.next.next;
            }
        }

        int getFirst(){
            if(head == null){
                System.out.println("list is empty");
                return -1;
            }
            return head.data;
        }

        int getLast(){
            if(head == null){
                System.out.println("List is empty");
                return -1;
            }
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }

            return temp.data;
        }

        int getAt(int idx){
            if(head == null){
                System.out.println("list is empty");
                return -1;
            }
            else if(idx == 0)
                return getFirst();
            else if(idx == size() - 1)
                return getLast();
            else{
                Node temp = head;
                for(int i = 0; i < idx; i++){
                    temp = temp.next;
                }
                return temp.data;
            }
        }

        int size(){
            // Node curr = head;
            // int count = 0;
            // while(curr != null){
            //     count++;
            //     curr = curr.next;
            // }
            // return count;
            return sizeRec(head);
        }

        int sizeRec(Node temp){
            if(temp == null)
                return 0;
            
            int count = 1 + sizeRec(temp.next);
            return count;
        }

        void display(){
            Node curr = head;
            while(curr != null){
                System.out.print(curr.data + " -> ");
                curr = curr.next;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        LinkedList list = new LinkedList();
        int n = scn.nextInt();

        for(int i = 0 ;i < n; i++){
            int num = scn.nextInt();
            list.addLast(num);
        }

        list.display();

        //list.addFirst(scn.nextInt());

        // System.out.println("Enter the value: ");
        // int val = scn.nextInt();
        // System.out.println("Enter index: ");
        // int idx = scn.nextInt();
        //list.addAtIndex(val, idx);

        // list.deleteFirst();

        // list.deleteLast();

        // list.deleteAt(idx);

        //System.out.println("size : " + list.size());
        
        // list.display();

        // int first = list.getFirst();
        // int last = list.getLast();
        // System.out.println("value at first: "+ first);
        // System.out.println("value at last: "+ last);

        // int idxValue = list.getAt(idx);
        // System.out.println("value at idx " + idx +" : " + idxValue);

        


        scn.close();
    }
}
