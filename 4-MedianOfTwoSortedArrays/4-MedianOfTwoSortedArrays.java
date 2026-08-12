// Last updated: 12/08/2026, 16:29:48
import java.util.*;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merge = new int[nums1.length + nums2.length];
        
        System.arraycopy(nums1, 0, merge, 0, nums1.length);
        System.arraycopy(nums2, 0, merge, nums1.length, nums2.length);
        
        Arrays.sort(merge);

        int n = merge.length;
        int mid = n / 2;

        if (n % 2 != 0) {
            return merge[mid];
        } else {
            return (merge[mid - 1] + merge[mid]) / 2.0;
        }
    }
}
