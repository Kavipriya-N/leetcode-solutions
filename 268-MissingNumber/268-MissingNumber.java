// Last updated: 12/08/2026, 16:26:03
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<=nums.length;i++)
        {
            map.put(i,1);
        } 
        for(int i: nums)
        {
            map.remove(i);
        }
        for(int i:map.keySet())
        return i;
        return -1;
        
    }
}