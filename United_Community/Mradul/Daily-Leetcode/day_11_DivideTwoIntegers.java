// https://leetcode.com/problems/divide-two-integers/

class Solution {
    public int divide(int dividend, int divisor) {
        // Handle special case of overflow
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        int sign = (dividend < 0) ^ (divisor < 0) ? -1 : 1;

        long absDividend = Math.abs((long) dividend);
        long absDivisor = Math.abs((long) divisor);
        long result = 0;

        // Perform bitwise division
        while (absDividend >= absDivisor) {
            long temp = absDivisor;
            long multiple = 1;

            // Use left shift for faster multiplication by 2
            while (absDividend >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }

            // Subtract the multiple of divisor from dividend
            absDividend -= temp;
            result += multiple;
        }
        result *= sign;

        if (result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } 
        else if (result < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        } 
        else {
            return (int) result;
        }
    }
}
