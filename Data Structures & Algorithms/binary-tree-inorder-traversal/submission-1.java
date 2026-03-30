/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            List<Integer> l = new ArrayList<>();
            return l;
        }

        List<Integer> l = new ArrayList<>();
        l = inorderTraversalH(root, l);
        return l;
    }

    private List<Integer> inorderTraversalH(TreeNode root, List<Integer> l) {
        if (root.right == null && root.left == null) {
            l.add(root.val);
        }
        else if (root.left != null && root.right == null) {
            l = inorderTraversalH(root.left, l);
            l.add(root.val);
        }
        else if (root.right != null && root.left == null){
            l.add(root.val);
            l = inorderTraversalH(root.right, l);
        } 
        else {
            l = inorderTraversalH(root.left, l);
            l.add(root.val);
            l = inorderTraversalH(root.right, l);
        }
        return l;
    }
}