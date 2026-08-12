// Last updated: 12/08/2026, 16:27:11
class Solution {
    public String convertToTitle(int n
    ) {
        StringBuilder result=new StringBuilder();
        while(n>0)
        {
            n--;
            char ch=(char)('A'+n%26);
            result.append(ch);
            n/=26;

        }
        return result.reverse().toString();
    }
}