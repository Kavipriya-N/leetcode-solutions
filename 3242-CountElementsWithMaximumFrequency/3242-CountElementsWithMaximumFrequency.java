// Last updated: 12/08/2026, 16:20:34
class Solution {
    public int maxFrequencyElements(int[] nums) {

        int[] count = new int[101];

        for(int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }

        int maxFreq = 0;

        for(int i = 0; i < 101; i++) {
            if(count[i] > maxFreq) {
                maxFreq = count[i];
            }
        }

        int answer = 0;

        for(int i = 0; i < 101; i++) {
            if(count[i] == maxFreq) {
                answer += count[i];
            }
        }

        return answer;
    }
}