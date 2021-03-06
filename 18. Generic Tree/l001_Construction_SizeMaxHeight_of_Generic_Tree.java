import java.util.ArrayList;
import java.util.Stack;

public class l001_Construction_SizeMaxHeight_of_Generic_Tree {
    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static Node contruction(int[] arr) {
        Node root = null;
        Stack<Node> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                st.pop();
            } else {
                Node t = new Node();
                t.data = arr[i];
                if (st.size() > 0) {
                    st.peek().children.add(t);
                } else {
                    root = t;
                }
                st.push(t);
            }
        }
        return root;
    }

    public static void display(Node node) {
        String str = node.data + " -> ";
        for (Node child : node.children) {
            str += child.data + ", ";
        }
        str += ".";
        System.out.println(str);

        for (Node child : node.children) {
            display(child);
        }
    }

    public static int size(Node root) {
        int s = 0;
        for (Node child : root.children) {
            s += size(child);
        }
        return s + 1;
    }

    public static int max(Node node) {
        int m = Integer.MIN_VALUE;
        for (Node child : node.children) {
            int cm = max(child);
            if (cm > m) {
                m = cm;
            }
        }
        if (node.data > m) {
            m = node.data;
        }
        return m;
    }

    public static int height(Node node) {
        int h = -1;
        for(Node child : node.children){
            int ch = height(child);
            h = Math.max(ch, h);
        }
        h += 1;
        return h;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 50, -1, 60, -1, -1, 30, 70, 110, -1, 120, -1, -1, 80, -1, 90, -1, -1, 40, 100, -1, -1,
                -1 };
        Node root = contruction(arr);
        // display(root);
        // System.out.println(size(root));
        int h = height(root);
        System.out.println(h);
    }
}
