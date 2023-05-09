package T011_Linked_List;
import java.util.*;
public class l003_LL_To_Stack {
    public static class LLToStack{
        LinkedList<Integer>  list;

        LLToStack(){
            list = new LinkedList<>();
        }

        int size(){
            return list.size();
        }

        void push(int val){
            list.addFirst(val);
        }

        int pop(){
            if(size() == 0){
                System.out.println("Stack underflow");
                return -1;
            }else{
                return list.removeFirst();
            }
        }

        int top(){
            if(size() == 0){
                System.out.println("stack empty");
                return -1;
            }else{
                return list.getFirst();
            }
        }
    }
    public static void main(String[] args) {
        LLToStack list = new LLToStack();

        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);

        System.out.println(list.size());
        System.out.println(list.pop());
        System.out.println(list.size());
        System.out.println(list.top());

        
    }
}
