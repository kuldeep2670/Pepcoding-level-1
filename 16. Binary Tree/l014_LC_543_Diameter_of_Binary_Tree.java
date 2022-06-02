
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

    // second approach using a class  time complexity n^2
    class Solution {
        public class pair {
            int h;
            int d;

            pair() {
            };

            pair(int h, int d) {
                this.h = h;
                this.d = d;
            }
        }

        public pair diameter(TreeNode node) {
            if (node == null) {
                return new pair(-1, 0);
            }

            pair la = diameter(node.left); // left answer
            pair ra = diameter(node.right); // right answer

            pair my = new pair();

            my.h = Math.max(la.h, ra.h) + 1;
            int accrossNode = la.h + ra.h + 2;
            my.d = Math.max(accrossNode, Math.max(la.d, ra.d));

            return my;
        }

        public int diameterOfBinaryTree(TreeNode root) {
            pair ans = diameter(root);
            return ans.d;
        }
    }

    // ----->  third approach using array of size 2
    // public int[] diameter(TreeNode node) {
    //     if (node == null) {
    //         return new int[] { -1, 0 };
    //     }

    //     int[] la = diameter(node.left);
    //     int[] ra = diameter(node.right);

    //     int[] my = new int[2];
    //     // 0 1 -- h, d

    //     my[0] = Math.max(la[0], ra[0]) + 1;
    //     int accrossNode = la[0] + ra[0] + 2;
    //     my[1] = Math.max(accrossNode, Math.max(la[1], ra[1]));

    //     return my;
    // }

    // public int diameterOfBinaryTree(TreeNode root) {
    //     int[] ans = diameter(root);
    //     return ans[1];
    // }

    // ----->  fourth approach using static /global
    // static int  ans = (int)1e9;
    // public int diameter4(TreeNode root){
    //     if( root == null )
    //         return -1;

    //     int lh = diameter4(root.left);
    //     int rh = diameter4(root.right);
        
    //     ans = Math.max(ans, lh + rh + 2);

    //     int myHeight = Math.max(lh,rh)+1;
    //     return myHeight;
    // }
    // public int diameterOfBinaryTree(TreeNode root){
    //     ans = -(int)1e9;
    //     diameter4(root);
    //     return ans;
    // }

}
