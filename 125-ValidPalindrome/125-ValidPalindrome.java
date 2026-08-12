// Last updated: 12/08/2026, 16:27:45
class Solution
    {
    boolean isPalindrome(String s)
    {
        StringBuilder cleaned = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleaned.append(Character.toLowerCase(c));
            }
        }

        String cleanedStr = cleaned.toString();
        String reversedStr = cleaned.reverse().toString();

        return cleanedStr.equals(reversedStr);
    }

}