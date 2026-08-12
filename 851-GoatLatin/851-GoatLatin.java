// Last updated: 12/08/2026, 16:23:47
class Solution {
    public String toGoatLatin(String sentence) {

        String[] words = sentence.split(" ");
        String vowels = "aeiouAEIOU";
        String ans = "";

        for (int i = 0; i < words.length; i++) {

            String word = words[i];

            if (vowels.indexOf(word.charAt(0)) != -1) {
                ans += word + "ma";
            } else {
                ans += word.substring(1) + word.charAt(0) + "ma";
            }

            for (int j = 0; j <= i; j++) {
                ans += "a";
            }

            if (i != words.length - 1) {
                ans += " ";
            }
        }

        return ans;
    }
}