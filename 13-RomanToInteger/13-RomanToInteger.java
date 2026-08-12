// Last updated: 12/08/2026, 16:29:36
class Solution {
    public int intVal(char ch)
    {
        if(ch=='I')
        return 1;
        else if(ch=='V') 
        return 5;
         else if(ch=='X') 
        return 10;
         else if(ch=='L') 
        return 50;
         else if(ch=='C') 
        return 100;
         else if(ch=='D') 
        return 500;
         else if(ch=='M') 
        return 1000;
        else
        return 0;
    }
    public int romanToInt(String s)
     {
        int sum=0;
        int i;
        for(i=0;i<s.length()-1;i++)
        {
            if(intVal(s.charAt(i)) >=  intVal(s.charAt(i+1)))
            {
            sum+=intVal(s.charAt(i));
            }
        
        else
        {
            sum+=intVal(s.charAt(i+1)) - intVal(s.charAt(i));
            i++;
        }
        }
        if(i != s.length()) 
        sum+=intVal(s.charAt(i));
        return sum;
    }
}