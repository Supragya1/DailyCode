// https://leetcode.com/problems/palindrome-number/

class Solution {
    public boolean isPalindrome(int x) {
        int sum = 0;
        
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }
        
        while (x > sum) {
            sum = x % 10 + sum*10;
            x /= 10;
        }
        return ((x == sum) || (x==sum/10));
    }
}