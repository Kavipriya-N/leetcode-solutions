class Solution {
    public int findTheLongestBalancedSubstring(String s) {

        int zero = 0;
        int one = 0;
        int max = 0;

        for(int i = 0; i < s.length(); i++) {

            if(s.charAt(i) == '0') {

                if(i > 0 && s.charAt(i - 1) == '1') {
                    zero = 0;
                }

                zero++;
            }
            else {
                one++;

                max = Math.max(max, 2 * Math.min(zero, one));

                if(i == s.length() - 1 || s.charAt(i + 1) == '0') {
                    one = 0;
                }
            }
        }

        return max;
    }
}