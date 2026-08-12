// Last updated: 12/08/2026, 16:24:11
class Solution {
    public boolean checkPossibility(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                count++;
                if (count > 1)
  
                return false;

                if (i > 0 && nums[i - 1] > nums[i + 1] &&
                    (i + 2 < nums.length && nums[i] > nums[i + 2])) {
                    return false;
                }
            }
        }

        return true;
    }
}
