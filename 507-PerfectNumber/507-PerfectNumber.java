// Last updated: 12/08/2026, 16:24:44
class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num == 1) return false; // 1 is not a perfect number ❌
        int sum = 1; // Start with 1 as a proper divisor

        for(int i = 2; i * i <= num; i++) {
            if(num % i == 0) {
                sum += i;
                if(i != num / i) sum += num / i; // Avoid duplicate when i*i == num
            }
        }
        
        return sum == num; // Return true if sum of divisors equals num
    }
}