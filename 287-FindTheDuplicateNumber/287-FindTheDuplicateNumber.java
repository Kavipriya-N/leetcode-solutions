// Last updated: 12/08/2026, 16:25:56
import java.util.Arrays;

class Solution {
    public int findDuplicate(int[] nums) {

        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 1; i++) {

            if(nums[i] == nums[i + 1]) {
                return nums[i];
            }
        }

        return -1;
    }
}