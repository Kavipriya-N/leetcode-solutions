// Last updated: 12/08/2026, 16:21:33
class Solution {
    public int finalValueAfterOperations(String[] operations) {

        int x = 0;

        for (int i = 0; i < operations.length; i++) {

            if (operations[i].contains("++")) {
                x++;
            } else {
                x--;
            }
        }

        return x;
    }
}