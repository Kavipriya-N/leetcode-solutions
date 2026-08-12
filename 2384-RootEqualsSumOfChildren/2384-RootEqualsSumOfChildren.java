// Last updated: 12/08/2026, 16:21:17
class Solution {
    public boolean checkTree(TreeNode root) {
        int root_val = root.val;
        int left_val = root.left.val;
        int right_val = root.right.val;

        return root_val == (left_val + right_val);
    }
}
