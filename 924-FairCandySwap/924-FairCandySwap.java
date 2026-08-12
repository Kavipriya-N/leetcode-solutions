// Last updated: 12/08/2026, 16:23:35
class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

        int sumA = 0;
        int sumB = 0;

        for(int i = 0; i < aliceSizes.length; i++) {
            sumA = sumA + aliceSizes[i];
        }

        for(int i = 0; i < bobSizes.length; i++) {
            sumB = sumB + bobSizes[i];
        }

        int diff = (sumB - sumA) / 2;

        for(int i = 0; i < aliceSizes.length; i++) {

            for(int j = 0; j < bobSizes.length; j++) {

                if(bobSizes[j] - aliceSizes[i] == diff) {
                    return new int[]{aliceSizes[i], bobSizes[j]};
                }
            }
        }

        return new int[]{};
    }
}