// Last updated: 12/08/2026, 16:21:13
class Solution {
    public int smallestEvenMultiple(int n) {

        if (n % 2 == 0) {
            return n;
        }

        return 2 * n;
    }
}