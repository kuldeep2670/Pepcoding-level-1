package T011_Linked_List;
import java.util.*;
public class l002_reverseLL {
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

        void reverse(){
            Node prev = null;
            Node curr = head;
            Node forw = null;

            while(curr != null){
                forw = curr.next;
                curr.next = prev;
                prev = curr;
                curr = forw;
            }
            head = prev;
        }

        

        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " -> ");
                temp = temp.next;
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

        list.reverse();

        list.display();
        scn.close();
    }
}
