// Last updated: 12/08/2026, 16:25:35
class Solution {
    public boolean isPerfectSquare(int num) {
        long i = 1;  
        while (i * i <= num) {
            if (i * i == num) {
                return true;
            }
            i++;
        }
        return false;
    }
}
