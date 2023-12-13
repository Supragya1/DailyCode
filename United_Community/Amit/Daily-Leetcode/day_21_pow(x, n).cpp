class Solution {
public:
    double myPow(double x, int n) {
        double ans = 1.0;
        long num = n;
        if (x == 1.0 || n == 0) {
            return 1.0;
        }
        if (num < 0) {
            x = 1/x;
            num = -num;
        }
        while (num > 0) {
            if (num % 2 == 1) {
                ans *= x;
            }
            x *= x;
            num /= 2;
        }
    return ans;
    }
};