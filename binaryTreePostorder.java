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
    public List<Integer> postorderTraversal(TreeNode root) {
         List<Integer> postorder = new ArrayList<>();

         // Postorder = left right root
         // Postoder = Reverse(root right left)

         TreeNode curr = root;

         while(curr!=null){

            // postorder.add(curr.val);

            if(curr.right!=null){

                TreeNode temp = curr.right;
                while(temp.left!=null && temp.left!=curr) temp = temp.left;

                if(temp.left==null){
                    temp.left = curr;
                    postorder.add(curr.val);
                    curr = curr.right;
                }
                else{
                    temp.left = null;
                    curr = curr.left;
                }
            }
            else{
                postorder.add(curr.val);
                curr = curr.left;
            }
         }

         Collections.reverse(postorder);

         return postorder;

         


        }
}
