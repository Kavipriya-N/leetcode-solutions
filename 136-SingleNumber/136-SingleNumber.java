// Last updated: 12/08/2026, 16:27:38
import java.util.*;

class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        
        
        return nums[nums.length - 1];
    }
}
