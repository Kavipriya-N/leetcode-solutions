// Last updated: 12/08/2026, 16:21:48
class Solution {
    public boolean checkIfPangram(String sentence) {

        boolean[] seen = new boolean[26];

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            seen[ch - 'a'] = true;
        }

        for (int i = 0; i < 26; i++) {
            if (seen[i] == false) {
                return false;
            }
        }

        return true;
    }
}