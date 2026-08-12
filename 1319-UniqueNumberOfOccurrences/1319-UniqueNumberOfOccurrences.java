// Last updated: 12/08/2026, 16:22:51
class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        int[] count = new int[2001];

        for(int i = 0; i < arr.length; i++) {
            count[arr[i] + 1000]++;
        }

        boolean[] seen = new boolean[arr.length + 1];

        for(int i = 0; i < count.length; i++) {

            if(count[i] > 0) {

                if(seen[count[i]]) {
                    return false;
                }

                seen[count[i]] = true;
            }
        }

        return true;
    }
}