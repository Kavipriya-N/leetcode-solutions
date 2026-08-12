// Last updated: 12/08/2026, 16:25:17
class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        Integer[] arr = set.toArray(new Integer[0]);
        Arrays.sort(arr);
        if (arr.length >= 3) {
            return arr[arr.length - 3];
        } else {
            return arr[arr.length - 1];
        }
    }
}
