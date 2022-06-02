
public class l014_LC_543_Diameter_of_Binary_Tree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    // first approach using height function
    public int height(TreeNode root) {
        return root == null ? -1 : Math.max(height(root.left), height(root.right)) + 1;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null)
            return 0;

        int ld = diameterOfBinaryTree(root.left);
        int rd = diameterOfBinaryTree(root.right);

        int lh = height(root.left);
        int rh = height(root.right);
        int myDia = lh + rh + 2;

        return Math.max(myDia, Math.max(ld, rd));
    }



    // second approach using a class
    class Solution {
        public class pair{
            int h;
            int d;
            
            pair(){};
            pair(int h, int d){
                this.h = h;
                this.d = d;
            }
        }
        
        public pair diameter(TreeNode node){
            if(node == null){
                return new pair(-1, 0);
            }
            
            
            pair la = diameter(node.left);  //left answer
            pair ra = diameter(node.right);  //right answer
            
            pair my = new pair();
            
            my.h = Math.max(la.h , ra.h ) + 1;
            int accrossNode = la.h + ra.h + 2; 
            my.d = Math.max(accrossNode, Math.max(la.d, ra.d));
            
            return my;
        }
        
        public int diameterOfBinaryTree(TreeNode root) {
            pair ans = diameter(root);
            return ans.d;
        }
    }
    // third approach
    // fourth approach

}
