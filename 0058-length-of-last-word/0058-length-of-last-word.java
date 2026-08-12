class Solution {
    public int lengthOfLastWord(String s) {
        String[] count=s.trim().split(" ");
        String lastword=count[count.length-1];
        return lastword.length();
        
    }
}