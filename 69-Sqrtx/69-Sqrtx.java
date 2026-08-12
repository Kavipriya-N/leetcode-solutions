// Last updated: 12/08/2026, 16:28:42
class Solution {
    public int mySqrt(int x) {

        int ans = 0;

        for (long i = 1; i * i <= x; i++) {
            ans = (int)i;
        }

        return ans;
    }
}