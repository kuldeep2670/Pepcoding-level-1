package T011_Linked_List;
import java.util.*;
public class l006_mid_of_LL {
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

        
        int mid(){
            Node slow = head;
            Node fast = head;
            while(fast.next != null && fast.next.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow.data;
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
       
        System.out.println(list.mid());
        scn.close();
    }
}
