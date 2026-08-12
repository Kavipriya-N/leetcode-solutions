// Last updated: 12/08/2026, 16:26:51
class Solution {
    public int rob(int[] nums) {
        int prevRob = 0;
        int maxRob = 0;

        for (int curValue : nums) {
            int temp = Math.max(maxRob, prevRob + curValue);
            prevRob = maxRob;
            maxRob = temp;
        }

        return maxRob;        
    }
}