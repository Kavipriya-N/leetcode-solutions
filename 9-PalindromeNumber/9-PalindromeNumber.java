// Last updated: 12/08/2026, 16:29:43
class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int original=x;
        while(x>0)
        {
            int rem=x%10;
            rev=rev*10+rem;
            x=x/10;
        }
        if(original==rev)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}