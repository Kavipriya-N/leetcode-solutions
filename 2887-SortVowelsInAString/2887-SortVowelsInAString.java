// Last updated: 12/08/2026, 16:20:43
import java.util.*;

class Solution {
    public String sortVowels(String s) {

        List<Character> vowels = new ArrayList<>();

        for (char ch : s.toCharArray()) {
            if (isVowel(ch)) {
                vowels.add(ch);
            }
        }

        Collections.sort(vowels);

        char[] result = s.toCharArray();
        int index = 0;

        for (int i = 0; i < result.length; i++) {
            if (isVowel(result[i])) {
                result[i] = vowels.get(index++);
            }
        }

        return new String(result);
    }

    private boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }
}