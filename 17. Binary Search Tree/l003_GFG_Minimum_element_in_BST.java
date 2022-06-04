class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class l003_GFG_Minimum_element_in_BST {

    // Function to find the minimum element in the given BST.
    int minValue(Node node) {
        if (node == null) {
            return -1;
        }
        Node curr = node;
        while (curr.left != null) {
            curr = curr.left;
        }
        return curr.data;
    }
}
