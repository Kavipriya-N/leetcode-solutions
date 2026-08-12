// Last updated: 12/08/2026, 16:24:47
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int first=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                count++;
            }
            else
            {
            first=Math.max(first,count);
            count=0;
            continue;
            }
                
        }return Math.max(first,count);

    }
}