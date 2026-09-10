class Solution {
    boolean isDigitSumPalindrome(int n) {
        int sum = 0;
        
        // Calculate the sum of the digits
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        
        // Since the maximum sum for n <= 10^9 is 81 (for 999999999),
        // it is a palindrome if it's a single digit or a multiple of 11.
        return sum < 10 || sum % 11 == 0;
    }
}