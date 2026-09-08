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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        boolean lefttoright = true;
        q.add(root);
        while(!q.isEmpty()){
            int lvlsize = q.size();
            List<Integer> tmp = new ArrayList<>();
            for(int i = 0; i < lvlsize; i++){
                tmp.add(0);
            }
            int first = 0;
            int last = lvlsize - 1;
            int count = lvlsize;
            while(count-- >0){
                TreeNode t = q.poll();
                if(t.left != null){
                    q.add(t.left);
                }
                if(t.right != null){
                    q.add(t.right);
                }
                if(lefttoright){
                    tmp.set(first, t.val);
                    first++;
                }else{
                    tmp.set(last, t.val);
                    last--;
                }
            }
            res.add(tmp);
            lefttoright = !lefttoright;
        }
        return res;
    }
}