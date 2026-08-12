// Last updated: 12/08/2026, 16:25:13
class Solution {
    public String addStrings(String num1, String num2) {

        String ans = "";
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {

            int sum = carry;

            if (i >= 0) {
                sum += num1.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                sum += num2.charAt(j) - '0';
                j--;
            }

            ans = (sum % 10) + ans;
            carry = sum / 10;
        }

        return ans;
    }
}