// Last updated: 12/08/2026, 16:25:09
class Solution {
    public int countSegments(String s) {

        s = s.trim();

        if(s.length() == 0) {
            return 0;
        }

        return s.split("\\s+").length;
    }
}