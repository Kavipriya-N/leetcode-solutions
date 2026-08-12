// Last updated: 12/08/2026, 16:23:53
class Solution {
    public int search(int[] nums, int target) {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                return i;
            }
            
        }
                return -1;
            
        
        
    }
}