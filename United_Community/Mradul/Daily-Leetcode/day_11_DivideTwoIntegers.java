// https://leetcode.com/problems/divide-two-integers/

class Solution {
    public int divide(int dividend, int divisor) {

       if (dividend == Integer.MIN_VALUE && divisor == -1) {
           return Integer.MAX_VALUE;
       }
       int sign = (dividend < 0) ^ (divisor < 0) ? -1 : 1;

       long absdivisor = Math.abs((long)divisor);
       long absdividend = Math.abs((long)dividend);

       long result = 0;

       while (absdividend >=  absdivisor) {
           long temp = absdivisor;
           long multiple = 1;

           while (absdividend >= (temp << 1)) { // << incers || >> decres
               temp <<= 1;
               multiple <<= 1;
           }
           absdividend -= temp;
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
           return (int)result;
       }
    }
}