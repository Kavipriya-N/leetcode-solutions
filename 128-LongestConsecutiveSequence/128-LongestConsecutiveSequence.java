// Last updated: 12/08/2026, 16:27:42
import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Set<Integer> set = new LinkedHashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        Integer[] arr = set.toArray(new Integer[0]);
        Arrays.sort(arr);

        int maxLen = 1;   
        int currLen = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1] + 1) {
                currLen++;  
            } else {
                currLen = 1; 
            }
            maxLen = Math.max(maxLen, currLen);
        }

        return maxLen;
    }
}
