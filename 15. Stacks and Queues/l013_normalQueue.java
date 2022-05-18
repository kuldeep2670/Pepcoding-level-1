// Normal Queue

// 1. You are required to complete the code of our CustomQueue class. The class should mimic the behaviour of a Queue and implement FIFO semantic.
// 2. Here is the list of functions that you are supposed to complete
//      2.1. add -> Should accept new data if there is space available in the underlying 
//              array or print "Queue overflow" otherwise.
//      2.2. remove -> Should remove and return value according to FIFO, if available or 
//              print "Queue underflow" otherwise and return -1.
//      2.3. peek -> Should return value according to FIFO, if available or print "Queue 
//             underflow" otherwise and return -1.
//      2.4. size -> Should return the number of elements available in the queue.
//      2.5. display -> Should print the elements of queue in FIFO manner (space- 
//             separated) ending with a line-break.
// 3. Input and Output is managed for you.


import java.io.*;

public class l013_normalQueue {
    public static class CustomQueue {
        int[] data;
        int front;
        int size;

        public CustomQueue(int cap) {
            data = new int[cap];
            front = 0;
            size = 0;
        }

        int size() {
            return size;
        }

        void display() {
            for(int i = 0; i<size; i++){
                int currIdx = (front + i) % data.length;
                System.out.print(data[currIdx] + " ");
            }
            System.out.println();
        }

        void add(int val) {
            if(size == data.length){
                System.out.println("Queue overflow");
            }
            else{
                int rear = (front + size ) % data.length;
                data[rear] = val;
                size++;
            }
        }

        int remove() {
            if(size == 0){
                System.out.println("Queue underflow");
                return -1;
            }
            else{
                int value = data[front];
                front  = (front + 1) % data.length;
                size--;
                return value;
            }
        }

        int peek() {
            if(size == 0){
                System.out.println("Queue underflow");
                return -1;
            }
            else{
                return data[front];
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        CustomQueue qu = new CustomQueue(n);

        String str = br.readLine();
        while (str.equals("quit") == false) {
            if (str.startsWith("add")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                qu.add(val);
            } else if (str.startsWith("remove")) {
                int val = qu.remove();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("peek")) {
                int val = qu.peek();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("size")) {
                System.out.println(qu.size());
            } else if (str.startsWith("display")) {
                qu.display();
            }
            str = br.readLine();
        }
    }
}
