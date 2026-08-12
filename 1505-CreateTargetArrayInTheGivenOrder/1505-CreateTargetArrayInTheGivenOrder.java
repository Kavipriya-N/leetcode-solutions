// Last updated: 12/08/2026, 16:22:27
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }

        int[] result = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}