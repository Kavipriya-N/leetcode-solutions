// Last updated: 12/08/2026, 16:20:35
class Solution {
    public int missingInteger(int[] nums) {

        int sum = nums[0];

        int i = 1;

        while (i < nums.length && nums[i] == nums[i - 1] + 1) {
            sum += nums[i];
            i++;
        }

        boolean found = true;

        while (found) {

            found = false;

            for (int num : nums) {
                if (num == sum) {
                    found = true;
                    sum++;
                    break;
                }
            }
        }

        return sum;
    }
}