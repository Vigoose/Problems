/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class maxPathSum {
    int res;
    public int maxPathSum(TreeNode root) {
        if (root == null) return 0;
        res = Integer.MIN_VALUE;
        helper(root);
        return res;
    }

    public int helper(TreeNode root){
        if (root == null) return 0;
        int left = Math.max(0, helper(root.left));
        int right = Math.max(0, helper(root.right));
        res = Math.max((left + right + root.val), res);
        return root.val + Math.max(left, right);
    }
}
