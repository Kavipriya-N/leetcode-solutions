// Last updated: 12/08/2026, 16:23:06
class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray())
        {
            if(!st.isEmpty() && st.peek()==c)
            {
                st.pop();
            }
            else
            {
                st.push(c);
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty())
        {
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}