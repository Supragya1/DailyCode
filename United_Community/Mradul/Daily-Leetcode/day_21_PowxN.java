// https://leetcode.com/problems/powx-n/


class Solution {
    public double myPow(double x, int n) {
        long N = n;

        if (n == 0) {
            return 1;
        }

        if (N < 0) {
            N = -N;
            x = 1 / x;
        }

        if (N % 2 == 0) {
            return myPow(x * x, (int) (N / 2));
        } 
        else {
            return x * myPow(x, (int) (N - 1));
        }
    }
}
