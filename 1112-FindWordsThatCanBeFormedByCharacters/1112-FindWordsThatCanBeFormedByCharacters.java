// Last updated: 12/08/2026, 16:23:08
class Solution {
    public int countCharacters(String[] words, String chars) {

        int ans = 0;

        for (String word : words) {

            int[] count = new int[26];

            for (int i = 0; i < chars.length(); i++) {
                count[chars.charAt(i) - 'a']++;
            }

            boolean possible = true;

            for (int i = 0; i < word.length(); i++) {

                char ch = word.charAt(i);

                if (count[ch - 'a'] == 0) {
                    possible = false;
                    break;
                }

                count[ch - 'a']--;
            }

            if (possible) {
                ans += word.length();
            }
        }

        return ans;
    }
}