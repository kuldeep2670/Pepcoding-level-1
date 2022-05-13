import java.util.*;
public class l001_stackDemo {
    public static void main(String[] args){
        //Stack creation
        Stack<Integer> st = new Stack<>();
        // st.push(10);
        // st.push(20);
        // st.push(30);
        // st.push(40);
        // st.push(50);

        // Stack overflow
        // while(true){
        //     st.push(10);
        // }

        //Stack underflow
        st.pop();
        st.peek();
        //System.out.println(st);
    }
}
