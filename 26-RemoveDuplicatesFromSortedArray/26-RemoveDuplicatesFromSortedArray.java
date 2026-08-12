// Last updated: 12/08/2026, 16:29:25
import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new LinkedHashSet<>(); 
        for (int num : nums) {
            set.add(num);
        }
        int i = 0;
        for (int num : set) {
            nums[i++] = num;
        }
        return set.size();
    }
}
