// Last updated: 12/08/2026, 16:25:22
class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        while(i<t.length() && j<s.length())
        {
                if(t.charAt(i)==s.charAt(j))
                {
                    i++;
                    j++;
                }
              
                else
                {
              i++;
                }
                      
            
        }
        if(j == s.length())
        return true;
        return false; 
    }
}