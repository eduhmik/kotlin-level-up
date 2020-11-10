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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> results = new ArrayList<>();
        if (root == null) {
            return results;
        }
        
        queue.add(root);
        
        while (queue.size() > 0) {
            List<Integer> row = new ArrayList<>();
            int rowSize = queue.size();
            
            while (rowSize > 0) {
                TreeNode current = queue.remove();
                
                if (current.left != null) {
                    queue.add(current.left);
                }
                
                if (current.right != null) {
                    queue.add(current.right);
                }
                
                row.add(current.val);
                rowSize--;
            }
            results.add(row);
        }
        return results;
    }
}
