// Last updated: 12/08/2026, 16:26:01
class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int[] temp=new int[n];
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=0)
            {
                temp[cnt++]= nums[i];
            }
        }
        for(int i=0;i<n;i++)
        nums[i]=temp[i];
    }
}