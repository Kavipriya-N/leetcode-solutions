// Last updated: 12/08/2026, 16:26:08
class Solution {
    public int addDigits(int num) {

        while (num >= 10) {
            int sum = 0;

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            num = sum;
        }

        return num;
    }
}