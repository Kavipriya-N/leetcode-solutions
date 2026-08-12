// Last updated: 12/08/2026, 16:23:56
class Solution {
    public int numJewelsInStones(String jewels, String stones) {

        int count = 0;

        for (int i = 0; i < stones.length(); i++) {

            if (jewels.indexOf(stones.charAt(i)) != -1) {
                count++;
            }
        }

        return count;
    }
}