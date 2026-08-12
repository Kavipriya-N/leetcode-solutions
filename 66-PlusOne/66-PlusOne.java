// Last updated: 12/08/2026, 16:28:52
class Solution {
    public int[] plusOne(int[] digits) {

        int len = digits.length;

        // Traverse from last digit
        for (int i = len - 1; i >= 0; i--) {

            // If digit is less than 9
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // If digit is 9 make it 0
            digits[i] = 0;
        }

        // If all digits are 9
        int[] result = new int[len + 1];
        result[0] = 1;

        return result;
    }
}