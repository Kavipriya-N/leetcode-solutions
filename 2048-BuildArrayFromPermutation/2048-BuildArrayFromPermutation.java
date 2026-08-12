// Last updated: 12/08/2026, 16:21:36
class Solution {
    public int[] buildArray(int[] nums) {

        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }
}