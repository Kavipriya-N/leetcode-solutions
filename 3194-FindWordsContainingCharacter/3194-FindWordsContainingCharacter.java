// Last updated: 12/08/2026, 16:20:37
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {

        List<Integer> ans = new ArrayList<>();

        for(int i = 0; i < words.length; i++) {

            if(words[i].indexOf(x) != -1) {
                ans.add(i);
            }
        }

        return ans;
    }
}