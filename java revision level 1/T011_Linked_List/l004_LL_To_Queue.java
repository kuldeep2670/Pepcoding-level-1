package T011_Linked_List;

import java.util.*;
public class l004_LL_To_Queue {
    public static class LLToQueue{
        LinkedList<Integer> list;

        LLToQueue(){
            list = new LinkedList<>();
        }

        int size(){
            return list.size();
        }

        void add(int val){
            list.addLast(val);
        }

        int remove(){
            if(size() == 0){
                System.out.println("Queue underflow");
                return -1;
            }else{
                return list.removeFirst();
            }
        }

        int peek(){
            if(size() == 0){
                System.out.println("Queue underflow");
                return -1;
            }else{
                return list.getFirst();
            }
        }
    }
    public static void main(String[] args) {
        LLToQueue qu = new LLToQueue();
        qu.add(10);
        qu.add(20);
        qu.add(30);
        qu.add(40);
        qu.add(50);

        System.out.println(qu.size());
        System.out.println(qu.remove());
        System.out.println(qu.size());
        System.out.println(qu.peek());

    }
}
