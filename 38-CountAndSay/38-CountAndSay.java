// Last updated: 12/08/2026, 16:29:08
class Solution {
    public String countAndSay(int n) {

        String ans = "1";

        for(int i = 2; i <= n; i++) {

            String temp = "";
            int count = 1;

            for(int j = 1; j < ans.length(); j++) {

                if(ans.charAt(j) == ans.charAt(j - 1)) {
                    count++;
                }
                else {
                    temp += count;
                    temp += ans.charAt(j - 1);
                    count = 1;
                }
            }

            temp += count;
            temp += ans.charAt(ans.length() - 1);

            ans = temp;
        }

        return ans;
    }
}