// Last updated: 12/08/2026, 16:23:50
class Solution {
    public boolean rotateString(String s, String goal) {

        if (s.length() != goal.length()) {
            return false;
        }

        String temp = s + s;

        return temp.contains(goal);
    }
}